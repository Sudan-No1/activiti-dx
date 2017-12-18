
package cn.dx.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICreateInfoService", targetNamespace = "http://ideal.sh.cn.tc")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICreateInfoService {


    /**
     * 
     * @param flowData
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createInfoByObject", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.CreateInfoByObject")
    @ResponseWrapper(localName = "createInfoByObjectResponse", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.CreateInfoByObjectResponse")
    public String createInfoByObject(
        @WebParam(name = "flowData", targetNamespace = "")
        FlowData flowData);

    /**
     * 
     * @param flowDataXml
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createInfo", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.CreateInfo")
    @ResponseWrapper(localName = "createInfoResponse", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.CreateInfoResponse")
    public String createInfo(
        @WebParam(name = "flowDataXml", targetNamespace = "")
        String flowDataXml);

    /**
     * 
     * @param code
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createSystem", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.CreateSystem")
    @ResponseWrapper(localName = "createSystemResponse", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.CreateSystemResponse")
    public String createSystem(
        @WebParam(name = "code", targetNamespace = "")
        String code,
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param code
     * @param name
     * @param state
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateSystem", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.UpdateSystem")
    @ResponseWrapper(localName = "updateSystemResponse", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.UpdateSystemResponse")
    public String updateSystem(
        @WebParam(name = "code", targetNamespace = "")
        String code,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "state", targetNamespace = "")
        String state);

    /**
     * 
     * @param code
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteSystem", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.DeleteSystem")
    @ResponseWrapper(localName = "deleteSystemResponse", targetNamespace = "http://ideal.sh.cn.tc", className = "tc.cn.sh.ideal.DeleteSystemResponse")
    public String deleteSystem(
        @WebParam(name = "code", targetNamespace = "")
        String code);

}
