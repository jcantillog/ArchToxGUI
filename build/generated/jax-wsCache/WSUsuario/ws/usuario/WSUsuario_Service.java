
package ws.usuario;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSUsuario", targetNamespace = "http://archtoxwebservice/", wsdlLocation = "http://170.239.86.165:8084/archtoxws/WSUsuario?wsdl")
public class WSUsuario_Service
    extends Service
{

    private final static URL WSUSUARIO_WSDL_LOCATION;
    private final static WebServiceException WSUSUARIO_EXCEPTION;
    private final static QName WSUSUARIO_QNAME = new QName("http://archtoxwebservice/", "WSUsuario");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://170.239.86.165:8084/archtoxws/WSUsuario?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSUSUARIO_WSDL_LOCATION = url;
        WSUSUARIO_EXCEPTION = e;
    }

    public WSUsuario_Service() {
        super(__getWsdlLocation(), WSUSUARIO_QNAME);
    }

    public WSUsuario_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSUSUARIO_QNAME, features);
    }

    public WSUsuario_Service(URL wsdlLocation) {
        super(wsdlLocation, WSUSUARIO_QNAME);
    }

    public WSUsuario_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSUSUARIO_QNAME, features);
    }

    public WSUsuario_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSUsuario_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSUsuario
     */
    @WebEndpoint(name = "WSUsuarioPort")
    public WSUsuario getWSUsuarioPort() {
        return super.getPort(new QName("http://archtoxwebservice/", "WSUsuarioPort"), WSUsuario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSUsuario
     */
    @WebEndpoint(name = "WSUsuarioPort")
    public WSUsuario getWSUsuarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://archtoxwebservice/", "WSUsuarioPort"), WSUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSUSUARIO_EXCEPTION!= null) {
            throw WSUSUARIO_EXCEPTION;
        }
        return WSUSUARIO_WSDL_LOCATION;
    }

}
