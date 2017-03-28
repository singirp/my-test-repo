package com.mulesoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.mule.api.MuleContext;
import org.mule.api.MuleMessage;
import org.mule.DefaultMuleMessage;

import org.mule.api.client.OperationOptions;
import org.mule.api.context.MuleContextAware;
import org.mule.module.http.api.HttpConstants;
import org.mule.module.http.api.client.HttpRequestOptionsBuilder;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * @author joshrosso - josh.rosso@mulesoft.com
 *
 * Custom authentication provider that makes external calls to validate username/password combinations.
 * If appropriate Authentication is returned, an OAuth token can be provisioned from the Mule application.
 */
public class AuthProvider implements AuthenticationProvider, MuleContextAware {

  private final OperationOptions httpPOST = HttpRequestOptionsBuilder.newOptions().method(HttpConstants.Methods.POST.name()).build();

  private final String AUTH_KEY = "authenticated";

  private final String USER_KEY = "username";

  private final String DEFAULT_GRANT = "ROLE_USER";

  private final ObjectMapper mapper = new ObjectMapper();

  private MuleContext muleContext;

  private Logger logger = Logger.getLogger(getClass().getName());

  private String authenticationHost;

  private String authenticationPort;

  private String authenticationPath;

  private String authenticationHTTPConnector;

  /**
   * Extract username and password from request; call external authentication provider. Create and return Authentication
   * object if validation is successful.
   *
   * @param credentials credentials provided by spring security, from inbound request.
   */
  public Authentication authenticate(Authentication credentials) throws AuthenticationException {
    Authentication auth = null;
    String username = credentials.getName();
    String password = credentials.getCredentials().toString();
    Map<String, String> userDetails = callExternalAuthentication(username, password);

    if (isUserAuthenticated(userDetails)) {
      List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
      grantedAuths.add(new SimpleGrantedAuthority(DEFAULT_GRANT));
      UserDetails principal = new User(userDetails.get(USER_KEY), password, grantedAuths);
      auth = new UsernamePasswordAuthenticationToken(principal, password, grantedAuths);
      logger.info("AUTH SUCCESSFUL");
    }

    return auth;
  }

  /**
   * Request, via https, to a backend service capable of validating credentials
   *
   * @param username username provided by the Authentication object
   * @param password password provided by the Authentication object
   */
  private Map<String, String> callExternalAuthentication(String username, String password) {
    Map<String, String> userDetails = new HashMap<>();
    logger.info("Request info sent to auth server");

    try {
        MuleMessage request = new DefaultMuleMessage("", muleContext);
        MuleMessage response = muleContext.getClient().send(String.format("%s:%s%s?username=%s&password=%s&connector=%s", authenticationHost, authenticationPort, authenticationPath, username, password, authenticationHTTPConnector), request, httpPOST);
        userDetails = mapper.readValue(response.getPayloadAsBytes(), new TypeReference<Map<String,String>>(){});
        logger.debug("Response from server was: " + response.getPayloadAsString());
    } catch (Exception ex) {
      logger.error("OAuth provider failed to reach out to authorization server.", ex);
    }

    return userDetails;

  }


  /**
   * Utility to check if the JSON response has infact validated the user as "AUTHENTICATED"
   *
   * @param userDetails response returned from the custom LDAP service
   * @return whether or not the user is validated for access.
   */
  private boolean isUserAuthenticated(Map<String, String> userDetails) {
    if (userDetails.get(AUTH_KEY).equals("true")) {
      return true;
    }
    return false;
  }

  @Override
  public boolean supports(Class<?> auth) {
    return auth.equals(UsernamePasswordAuthenticationToken.class);
  }

  @Override
  public void setMuleContext(MuleContext muleContext) {
    this.muleContext = muleContext;
  }

  public String getAuthenticationHost() {
    return authenticationHost;
  }
  
  public void setAuthenticationHost(String authenticationHost) {
    this.authenticationHost = authenticationHost;
  }

  public String getAuthenticationPort() {
    return authenticationPort;
  }

  public void setAuthenticationPort(String authenticationPort) {
    this.authenticationPort = authenticationPort;
  }

  public String getAuthenticationPath() {
    return authenticationPath;
  }

  public void setAuthenticationPath(String authenticationPath) {
    this.authenticationPath = authenticationPath;
  }

  public String getAuthenticationHTTPConnector() {
    return authenticationHTTPConnector;
  }

  public void setAuthenticationHTTPConnector(String authenticationHTTPConnector) {
    this.authenticationHTTPConnector = authenticationHTTPConnector;
  }

}
