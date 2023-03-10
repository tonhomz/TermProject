
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CovidWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CovidWebService {


    /**
     * 
     * @param year
     * @return
     *     returns service.Coviddata2
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByYear", targetNamespace = "http://service/", className = "service.FindByYear")
    @ResponseWrapper(localName = "findByYearResponse", targetNamespace = "http://service/", className = "service.FindByYearResponse")
    @Action(input = "http://service/CovidWebService/findByYearRequest", output = "http://service/CovidWebService/findByYearResponse")
    public Coviddata2 findByYear(
        @WebParam(name = "year", targetNamespace = "")
        int year);

}
