
package serviciocliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviciocliente package. 
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

    private final static QName _CuadradoResponse_QNAME = new QName("http://jaxws/", "cuadradoResponse");
    private final static QName _Cuadrado_QNAME = new QName("http://jaxws/", "cuadrado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviciocliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cuadrado }
     * 
     */
    public Cuadrado createCuadrado() {
        return new Cuadrado();
    }

    /**
     * Create an instance of {@link CuadradoResponse }
     * 
     */
    public CuadradoResponse createCuadradoResponse() {
        return new CuadradoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuadradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws/", name = "cuadradoResponse")
    public JAXBElement<CuadradoResponse> createCuadradoResponse(CuadradoResponse value) {
        return new JAXBElement<CuadradoResponse>(_CuadradoResponse_QNAME, CuadradoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cuadrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jaxws/", name = "cuadrado")
    public JAXBElement<Cuadrado> createCuadrado(Cuadrado value) {
        return new JAXBElement<Cuadrado>(_Cuadrado_QNAME, Cuadrado.class, null, value);
    }

}
