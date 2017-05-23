
package ws.usuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.usuario package. 
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

    private final static QName _AgregarUsuario_QNAME = new QName("http://archtoxwebservice/", "agregarUsuario");
    private final static QName _BuscarRolResponse_QNAME = new QName("http://archtoxwebservice/", "buscarRolResponse");
    private final static QName _Rol_QNAME = new QName("http://archtoxwebservice/", "rol");
    private final static QName _AgregarAcceso_QNAME = new QName("http://archtoxwebservice/", "agregarAcceso");
    private final static QName _Acceso_QNAME = new QName("http://archtoxwebservice/", "acceso");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://archtoxwebservice/", "obtenerUsuario");
    private final static QName _IniciarSesion_QNAME = new QName("http://archtoxwebservice/", "iniciarSesion");
    private final static QName _ObtenerNombreUsuario_QNAME = new QName("http://archtoxwebservice/", "obtenerNombreUsuario");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://archtoxwebservice/", "obtenerUsuarioResponse");
    private final static QName _Usuario_QNAME = new QName("http://archtoxwebservice/", "usuario");
    private final static QName _IniciarSesionResponse_QNAME = new QName("http://archtoxwebservice/", "iniciarSesionResponse");
    private final static QName _BuscarRol_QNAME = new QName("http://archtoxwebservice/", "buscarRol");
    private final static QName _ObtenerNombreUsuarioResponse_QNAME = new QName("http://archtoxwebservice/", "obtenerNombreUsuarioResponse");
    private final static QName _AgregarUsuarioResponse_QNAME = new QName("http://archtoxwebservice/", "agregarUsuarioResponse");
    private final static QName _AgregarAccesoResponse_QNAME = new QName("http://archtoxwebservice/", "agregarAccesoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.usuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarAcceso }
     * 
     */
    public AgregarAcceso createAgregarAcceso() {
        return new AgregarAcceso();
    }

    /**
     * Create an instance of {@link Acceso }
     * 
     */
    public Acceso createAcceso() {
        return new Acceso();
    }

    /**
     * Create an instance of {@link AgregarUsuario }
     * 
     */
    public AgregarUsuario createAgregarUsuario() {
        return new AgregarUsuario();
    }

    /**
     * Create an instance of {@link BuscarRolResponse }
     * 
     */
    public BuscarRolResponse createBuscarRolResponse() {
        return new BuscarRolResponse();
    }

    /**
     * Create an instance of {@link Rol }
     * 
     */
    public Rol createRol() {
        return new Rol();
    }

    /**
     * Create an instance of {@link ObtenerNombreUsuarioResponse }
     * 
     */
    public ObtenerNombreUsuarioResponse createObtenerNombreUsuarioResponse() {
        return new ObtenerNombreUsuarioResponse();
    }

    /**
     * Create an instance of {@link AgregarUsuarioResponse }
     * 
     */
    public AgregarUsuarioResponse createAgregarUsuarioResponse() {
        return new AgregarUsuarioResponse();
    }

    /**
     * Create an instance of {@link AgregarAccesoResponse }
     * 
     */
    public AgregarAccesoResponse createAgregarAccesoResponse() {
        return new AgregarAccesoResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link IniciarSesion }
     * 
     */
    public IniciarSesion createIniciarSesion() {
        return new IniciarSesion();
    }

    /**
     * Create an instance of {@link ObtenerNombreUsuario }
     * 
     */
    public ObtenerNombreUsuario createObtenerNombreUsuario() {
        return new ObtenerNombreUsuario();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link IniciarSesionResponse }
     * 
     */
    public IniciarSesionResponse createIniciarSesionResponse() {
        return new IniciarSesionResponse();
    }

    /**
     * Create an instance of {@link BuscarRol }
     * 
     */
    public BuscarRol createBuscarRol() {
        return new BuscarRol();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "agregarUsuario")
    public JAXBElement<AgregarUsuario> createAgregarUsuario(AgregarUsuario value) {
        return new JAXBElement<AgregarUsuario>(_AgregarUsuario_QNAME, AgregarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "buscarRolResponse")
    public JAXBElement<BuscarRolResponse> createBuscarRolResponse(BuscarRolResponse value) {
        return new JAXBElement<BuscarRolResponse>(_BuscarRolResponse_QNAME, BuscarRolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "rol")
    public JAXBElement<Rol> createRol(Rol value) {
        return new JAXBElement<Rol>(_Rol_QNAME, Rol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAcceso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "agregarAcceso")
    public JAXBElement<AgregarAcceso> createAgregarAcceso(AgregarAcceso value) {
        return new JAXBElement<AgregarAcceso>(_AgregarAcceso_QNAME, AgregarAcceso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Acceso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "acceso")
    public JAXBElement<Acceso> createAcceso(Acceso value) {
        return new JAXBElement<Acceso>(_Acceso_QNAME, Acceso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "obtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "iniciarSesion")
    public JAXBElement<IniciarSesion> createIniciarSesion(IniciarSesion value) {
        return new JAXBElement<IniciarSesion>(_IniciarSesion_QNAME, IniciarSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNombreUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "obtenerNombreUsuario")
    public JAXBElement<ObtenerNombreUsuario> createObtenerNombreUsuario(ObtenerNombreUsuario value) {
        return new JAXBElement<ObtenerNombreUsuario>(_ObtenerNombreUsuario_QNAME, ObtenerNombreUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "obtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "iniciarSesionResponse")
    public JAXBElement<IniciarSesionResponse> createIniciarSesionResponse(IniciarSesionResponse value) {
        return new JAXBElement<IniciarSesionResponse>(_IniciarSesionResponse_QNAME, IniciarSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "buscarRol")
    public JAXBElement<BuscarRol> createBuscarRol(BuscarRol value) {
        return new JAXBElement<BuscarRol>(_BuscarRol_QNAME, BuscarRol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNombreUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "obtenerNombreUsuarioResponse")
    public JAXBElement<ObtenerNombreUsuarioResponse> createObtenerNombreUsuarioResponse(ObtenerNombreUsuarioResponse value) {
        return new JAXBElement<ObtenerNombreUsuarioResponse>(_ObtenerNombreUsuarioResponse_QNAME, ObtenerNombreUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "agregarUsuarioResponse")
    public JAXBElement<AgregarUsuarioResponse> createAgregarUsuarioResponse(AgregarUsuarioResponse value) {
        return new JAXBElement<AgregarUsuarioResponse>(_AgregarUsuarioResponse_QNAME, AgregarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAccesoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://archtoxwebservice/", name = "agregarAccesoResponse")
    public JAXBElement<AgregarAccesoResponse> createAgregarAccesoResponse(AgregarAccesoResponse value) {
        return new JAXBElement<AgregarAccesoResponse>(_AgregarAccesoResponse_QNAME, AgregarAccesoResponse.class, null, value);
    }

}
