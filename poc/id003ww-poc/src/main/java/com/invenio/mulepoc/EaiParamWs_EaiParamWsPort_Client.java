
package com.invenio.mulepoc;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebResult;
//import javax.jws.WebService;
//import javax.xml.bind.annotation.XmlSeeAlso;
//import javax.xml.ws.RequestWrapper;
//import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2013-11-13T17:22:30.681+05:30
 * Generated source version: 2.5.1
 * 
 */
public final class EaiParamWs_EaiParamWsPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.global.mapping.eai.umgi.com/", "EaiParamWsService");

    private EaiParamWs_EaiParamWsPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EaiParamWsService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        EaiParamWsService ss = new EaiParamWsService(wsdlURL, SERVICE_NAME);
        EaiParamWs port = ss.getEaiParamWsPort();  
        
        {
        System.out.println("Invoking findAllEaiParamByKey1Key2Key3Key4...");
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4_key1 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4_key2 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4_key3 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4_key4 = "";
        java.util.List<com.invenio.mulepoc.EaiParam> _findAllEaiParamByKey1Key2Key3Key4__return = port.findAllEaiParamByKey1Key2Key3Key4(_findAllEaiParamByKey1Key2Key3Key4_key1, _findAllEaiParamByKey1Key2Key3Key4_key2, _findAllEaiParamByKey1Key2Key3Key4_key3, _findAllEaiParamByKey1Key2Key3Key4_key4);
        System.out.println("findAllEaiParamByKey1Key2Key3Key4.result=" + _findAllEaiParamByKey1Key2Key3Key4__return);


        }
        {
        System.out.println("Invoking findAllEaiParamByKey1Key2ValidFrom...");
        java.lang.String _findAllEaiParamByKey1Key2ValidFrom_key1 = "";
        java.lang.String _findAllEaiParamByKey1Key2ValidFrom_key2 = "";
        java.lang.String _findAllEaiParamByKey1Key2ValidFrom_validFrom = "";
        java.util.List<com.invenio.mulepoc.EaiParam> _findAllEaiParamByKey1Key2ValidFrom__return = port.findAllEaiParamByKey1Key2ValidFrom(_findAllEaiParamByKey1Key2ValidFrom_key1, _findAllEaiParamByKey1Key2ValidFrom_key2, _findAllEaiParamByKey1Key2ValidFrom_validFrom);
        System.out.println("findAllEaiParamByKey1Key2ValidFrom.result=" + _findAllEaiParamByKey1Key2ValidFrom__return);


        }
        {
        System.out.println("Invoking findAllEaiParamByKey1Key2Key3...");
        java.lang.String _findAllEaiParamByKey1Key2Key3_key1 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3_key2 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3_key3 = "";
        java.util.List<com.invenio.mulepoc.EaiParam> _findAllEaiParamByKey1Key2Key3__return = port.findAllEaiParamByKey1Key2Key3(_findAllEaiParamByKey1Key2Key3_key1, _findAllEaiParamByKey1Key2Key3_key2, _findAllEaiParamByKey1Key2Key3_key3);
        System.out.println("findAllEaiParamByKey1Key2Key3.result=" + _findAllEaiParamByKey1Key2Key3__return);


        }
        {
        System.out.println("Invoking findAllEaiParamByKey1Key2Key3Key4ValidFrom...");
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4ValidFrom_key1 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4ValidFrom_key2 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4ValidFrom_key3 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4ValidFrom_key4 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3Key4ValidFrom_validFrom = "";
        java.util.List<com.invenio.mulepoc.EaiParam> _findAllEaiParamByKey1Key2Key3Key4ValidFrom__return = port.findAllEaiParamByKey1Key2Key3Key4ValidFrom(_findAllEaiParamByKey1Key2Key3Key4ValidFrom_key1, _findAllEaiParamByKey1Key2Key3Key4ValidFrom_key2, _findAllEaiParamByKey1Key2Key3Key4ValidFrom_key3, _findAllEaiParamByKey1Key2Key3Key4ValidFrom_key4, _findAllEaiParamByKey1Key2Key3Key4ValidFrom_validFrom);
        System.out.println("findAllEaiParamByKey1Key2Key3Key4ValidFrom.result=" + _findAllEaiParamByKey1Key2Key3Key4ValidFrom__return);


        }
        {
        System.out.println("Invoking findAllEaiParamByKey1Key2Key3ValidFrom...");
        java.lang.String _findAllEaiParamByKey1Key2Key3ValidFrom_key1 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3ValidFrom_key2 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3ValidFrom_key3 = "";
        java.lang.String _findAllEaiParamByKey1Key2Key3ValidFrom_validFrom = "";
        java.util.List<com.invenio.mulepoc.EaiParam> _findAllEaiParamByKey1Key2Key3ValidFrom__return = port.findAllEaiParamByKey1Key2Key3ValidFrom(_findAllEaiParamByKey1Key2Key3ValidFrom_key1, _findAllEaiParamByKey1Key2Key3ValidFrom_key2, _findAllEaiParamByKey1Key2Key3ValidFrom_key3, _findAllEaiParamByKey1Key2Key3ValidFrom_validFrom);
        System.out.println("findAllEaiParamByKey1Key2Key3ValidFrom.result=" + _findAllEaiParamByKey1Key2Key3ValidFrom__return);


        }
        {
        System.out.println("Invoking findAllEaiParamByKey1Key2...");
        java.lang.String _findAllEaiParamByKey1Key2_key1 = "";
        java.lang.String _findAllEaiParamByKey1Key2_key2 = "";
        java.util.List<com.invenio.mulepoc.EaiParam> _findAllEaiParamByKey1Key2__return = port.findAllEaiParamByKey1Key2(_findAllEaiParamByKey1Key2_key1, _findAllEaiParamByKey1Key2_key2);
        System.out.println("findAllEaiParamByKey1Key2.result=" + _findAllEaiParamByKey1Key2__return);


        }
        {
        System.out.println("Invoking findEaiParamValues...");
        com.invenio.mulepoc.ParamInput _findEaiParamValues_input = null;
        try {
            java.util.List<com.invenio.mulepoc.EaiParam> _findEaiParamValues__return = port.findEaiParamValues(_findEaiParamValues_input);
            System.out.println("findEaiParamValues.result=" + _findEaiParamValues__return);

        } catch (Throwable_Exception e) { 
            System.out.println("Expected exception: Throwable has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking findAllEaiParam...");
        java.util.List<com.invenio.mulepoc.EaiParam> _findAllEaiParam__return = port.findAllEaiParam();
        System.out.println("findAllEaiParam.result=" + _findAllEaiParam__return);


        }

        System.exit(0);
    }

}