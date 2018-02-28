
package service.iva;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.iva package. 
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

    private final static QName _Consumir_QNAME = new QName("http://iva.service/", "consumir");
    private final static QName _ConsumirResponse_QNAME = new QName("http://iva.service/", "consumirResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.iva
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Consumir }
     * 
     */
    public Consumir createConsumir() {
        return new Consumir();
    }

    /**
     * Create an instance of {@link ConsumirResponse }
     * 
     */
    public ConsumirResponse createConsumirResponse() {
        return new ConsumirResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consumir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iva.service/", name = "consumir")
    public JAXBElement<Consumir> createConsumir(Consumir value) {
        return new JAXBElement<Consumir>(_Consumir_QNAME, Consumir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iva.service/", name = "consumirResponse")
    public JAXBElement<ConsumirResponse> createConsumirResponse(ConsumirResponse value) {
        return new JAXBElement<ConsumirResponse>(_ConsumirResponse_QNAME, ConsumirResponse.class, null, value);
    }

}
