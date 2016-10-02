
package com.clientws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.clientws package. 
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

    private final static QName _AddBeerResponse_QNAME = new QName("http://inv/", "addBeerResponse");
    private final static QName _GetAllBeers_QNAME = new QName("http://inv/", "getAllBeers");
    private final static QName _GetAllBeersResponse_QNAME = new QName("http://inv/", "getAllBeersResponse");
    private final static QName _AddBeer_QNAME = new QName("http://inv/", "addBeer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.clientws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBeer }
     * 
     */
    public AddBeer createAddBeer() {
        return new AddBeer();
    }

    /**
     * Create an instance of {@link AddBeerResponse }
     * 
     */
    public AddBeerResponse createAddBeerResponse() {
        return new AddBeerResponse();
    }

    /**
     * Create an instance of {@link GetAllBeers }
     * 
     */
    public GetAllBeers createGetAllBeers() {
        return new GetAllBeers();
    }

    /**
     * Create an instance of {@link GetAllBeersResponse }
     * 
     */
    public GetAllBeersResponse createGetAllBeersResponse() {
        return new GetAllBeersResponse();
    }

    /**
     * Create an instance of {@link Beers }
     * 
     */
    public Beers createBeers() {
        return new Beers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBeerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inv/", name = "addBeerResponse")
    public JAXBElement<AddBeerResponse> createAddBeerResponse(AddBeerResponse value) {
        return new JAXBElement<AddBeerResponse>(_AddBeerResponse_QNAME, AddBeerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBeers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inv/", name = "getAllBeers")
    public JAXBElement<GetAllBeers> createGetAllBeers(GetAllBeers value) {
        return new JAXBElement<GetAllBeers>(_GetAllBeers_QNAME, GetAllBeers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBeersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inv/", name = "getAllBeersResponse")
    public JAXBElement<GetAllBeersResponse> createGetAllBeersResponse(GetAllBeersResponse value) {
        return new JAXBElement<GetAllBeersResponse>(_GetAllBeersResponse_QNAME, GetAllBeersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBeer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inv/", name = "addBeer")
    public JAXBElement<AddBeer> createAddBeer(AddBeer value) {
        return new JAXBElement<AddBeer>(_AddBeer_QNAME, AddBeer.class, null, value);
    }

}
