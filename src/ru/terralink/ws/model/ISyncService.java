
package ru.terralink.ws.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISyncService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ISyncService {


    /**
     * 
     * @param request
     */
    @WebMethod(operationName = "SyncContract", action = "http://tempuri.org/ISyncService/SyncContract")
    @RequestWrapper(localName = "SyncContract", targetNamespace = "http://tempuri.org/", className = "ru.terralink.ws.model.SyncContract")
    @ResponseWrapper(localName = "SyncContractResponse", targetNamespace = "http://tempuri.org/", className = "ru.terralink.ws.model.SyncContractResponse")
    public void syncContract(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        SyncRequest request);

    /**
     * 
     * @param request
     */
    @WebMethod(operationName = "SyncOutContractURL", action = "http://tempuri.org/ISyncService/SyncOutContractURL")
    @RequestWrapper(localName = "SyncOutContractURL", targetNamespace = "http://tempuri.org/", className = "ru.terralink.ws.model.SyncOutContractURL")
    @ResponseWrapper(localName = "SyncOutContractURLResponse", targetNamespace = "http://tempuri.org/", className = "ru.terralink.ws.model.SyncOutContractURLResponse")
    public void syncOutContractURL(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        SyncOutRequest request);

    /**
     * 
     * @param request
     */
    @WebMethod(operationName = "SyncOutContractData", action = "http://tempuri.org/ISyncService/SyncOutContractData")
    @RequestWrapper(localName = "SyncOutContractData", targetNamespace = "http://tempuri.org/", className = "ru.terralink.ws.model.SyncOutContractData")
    @ResponseWrapper(localName = "SyncOutContractDataResponse", targetNamespace = "http://tempuri.org/", className = "ru.terralink.ws.model.SyncOutContractDataResponse")
    public void syncOutContractData(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        SyncOutRequest request);

}
