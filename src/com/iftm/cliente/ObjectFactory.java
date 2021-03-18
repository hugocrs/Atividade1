
package com.iftm.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iftm.cliente package. 
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

    private final static QName _NomeResponse_QNAME = new QName("http://iftm.com/", "nomeResponse");
    private final static QName _Calcula_QNAME = new QName("http://iftm.com/", "calcula");
    private final static QName _Nome_QNAME = new QName("http://iftm.com/", "nome");
    private final static QName _CalculaResponse_QNAME = new QName("http://iftm.com/", "calculaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iftm.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculaResponse }
     * 
     */
    public CalculaResponse createCalculaResponse() {
        return new CalculaResponse();
    }

    /**
     * Create an instance of {@link Calcula }
     * 
     */
    public Calcula createCalcula() {
        return new Calcula();
    }

    /**
     * Create an instance of {@link Nome }
     * 
     */
    public Nome createNome() {
        return new Nome();
    }

    /**
     * Create an instance of {@link NomeResponse }
     * 
     */
    public NomeResponse createNomeResponse() {
        return new NomeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iftm.com/", name = "nomeResponse")
    public JAXBElement<NomeResponse> createNomeResponse(NomeResponse value) {
        return new JAXBElement<NomeResponse>(_NomeResponse_QNAME, NomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iftm.com/", name = "calcula")
    public JAXBElement<Calcula> createCalcula(Calcula value) {
        return new JAXBElement<Calcula>(_Calcula_QNAME, Calcula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iftm.com/", name = "nome")
    public JAXBElement<Nome> createNome(Nome value) {
        return new JAXBElement<Nome>(_Nome_QNAME, Nome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iftm.com/", name = "calculaResponse")
    public JAXBElement<CalculaResponse> createCalculaResponse(CalculaResponse value) {
        return new JAXBElement<CalculaResponse>(_CalculaResponse_QNAME, CalculaResponse.class, null, value);
    }

}
