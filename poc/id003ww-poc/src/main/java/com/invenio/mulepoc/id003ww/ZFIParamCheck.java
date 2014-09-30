package com.invenio.mulepoc.id003ww;

import java.util.*;
import java.net.URL;
import javax.xml.namespace.QName;
import com.invenio.mulepoc.*;

public class ZFIParamCheck {
	public String validateZFIParam(String country) throws Exception{
		String result = "";
		//System.out.println("In validateZFIParam() -- Country is " + country);
		URL wsdlUrl = new URL("http://172.25.172.200:8080/EaiParamWsService/EaiParamWs?wsdl");
		QName ns = new QName("http://ws.global.mapping.eai.umgi.com/", "EaiParamWsService");
		EaiParamWsService ws = new EaiParamWsService(wsdlUrl, ns);
		EaiParamWs service = ws.getEaiParamWsPort();
		ParamInput ip = new ParamInput();
		ip.setClient("900");
		ip.setKey1("ID003WW");
		ip.setKey2(country);
		ip.setValidFrom("20131113");
		List<EaiParam> l=  service.findEaiParamValues(ip);
		for (int i = 0; i < l.size(); i++) {
            EaiParam tmpParam = l.get( i );
            if (tmpParam.getParaName().contains( "EXTENDED_VERSION_Y_N" )) {
                result = tmpParam.getParaParam().trim().toUpperCase();
            }
        }
		return result;
	}
}
