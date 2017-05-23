
package ws.rol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.rol package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarRoles_QNAME = new QName("http://archtoxwebservice/", "listarRoles");
    private final static QName _ListarRolesResponse_QNAME = new QName("http://archtoxwebservice/", "listarRolesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.rol
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarRoles }
     * 
     */
    public ListarRoles createListarRoles() {
        return new ListarRoles();
    }

    /**
     * Create an instance of {@link ListarRolesResponse }
     * 
     */
    public ListarRolesResponse createListarRolesResponse() {
        return new ListarRolesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "listarRoles")
    public JAXBElement<ListarRoles> createListarRoles(ListarRoles value) {
        return new JAXBElement<ListarRoles>(_ListarRoles_QNAME, ListarRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "listarRolesResponse")
    public JAXBElement<ListarRolesResponse> createListarRolesResponse(ListarRolesResponse value) {
        return new JAXBElement<ListarRolesResponse>(_ListarRolesResponse_QNAME, ListarRolesResponse.class, null, value);
    }

}
