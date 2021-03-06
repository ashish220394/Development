
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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://calculator/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param arg2
     * @param arg1
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "plus", targetNamespace = "http://calculator/", className = "service.Plus")
    @ResponseWrapper(localName = "plusResponse", targetNamespace = "http://calculator/", className = "service.PlusResponse")
    @Action(input = "http://calc/Calculator/plusRequest", output = "http://calc/Calculator/plusResponse")
    public int plus(
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "minus", targetNamespace = "http://calculator/", className = "service.Minus")
    @ResponseWrapper(localName = "minusResponse", targetNamespace = "http://calculator/", className = "service.MinusResponse")
    @Action(input = "http://calculator/Calculator/minusRequest", output = "http://calculator/Calculator/minusResponse")
    public int minus(
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://calculator/", className = "service.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://calculator/", className = "service.MultiplyResponse")
    @Action(input = "http://calculator/Calculator/multiplyRequest", output = "http://calculator/Calculator/multiplyResponse")
    public int multiply(
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://calculator/", className = "service.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://calculator/", className = "service.DivideResponse")
    @Action(input = "http://calculator/Calculator/divideRequest", output = "http://calculator/Calculator/divideResponse")
    public int divide(
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
