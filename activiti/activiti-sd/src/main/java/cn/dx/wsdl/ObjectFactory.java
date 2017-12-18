
package cn.dx.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tc.cn.sh.ideal package. 
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

    private final static QName _CreateInfoByObjectResponse_QNAME = new QName("http://ideal.sh.cn.tc", "createInfoByObjectResponse");
    private final static QName _CreateSystem_QNAME = new QName("http://ideal.sh.cn.tc", "createSystem");
    private final static QName _CreateInfo_QNAME = new QName("http://ideal.sh.cn.tc", "createInfo");
    private final static QName _UpdateSystemResponse_QNAME = new QName("http://ideal.sh.cn.tc", "updateSystemResponse");
    private final static QName _CreateInfoByObject_QNAME = new QName("http://ideal.sh.cn.tc", "createInfoByObject");
    private final static QName _CreateSystemResponse_QNAME = new QName("http://ideal.sh.cn.tc", "createSystemResponse");
    private final static QName _DeleteSystem_QNAME = new QName("http://ideal.sh.cn.tc", "deleteSystem");
    private final static QName _UpdateSystem_QNAME = new QName("http://ideal.sh.cn.tc", "updateSystem");
    private final static QName _CreateInfoResponse_QNAME = new QName("http://ideal.sh.cn.tc", "createInfoResponse");
    private final static QName _DeleteSystemResponse_QNAME = new QName("http://ideal.sh.cn.tc", "deleteSystemResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tc.cn.sh.ideal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlowData }
     * 
     */
    public FlowData createFlowData() {
        return new FlowData();
    }

    /**
     * Create an instance of {@link CreateInfoByObject }
     * 
     */
    public CreateInfoByObject createCreateInfoByObject() {
        return new CreateInfoByObject();
    }

    /**
     * Create an instance of {@link CreateSystemResponse }
     * 
     */
    public CreateSystemResponse createCreateSystemResponse() {
        return new CreateSystemResponse();
    }

    /**
     * Create an instance of {@link DeleteSystem }
     * 
     */
    public DeleteSystem createDeleteSystem() {
        return new DeleteSystem();
    }

    /**
     * Create an instance of {@link UpdateSystem }
     * 
     */
    public UpdateSystem createUpdateSystem() {
        return new UpdateSystem();
    }

    /**
     * Create an instance of {@link CreateInfoResponse }
     * 
     */
    public CreateInfoResponse createCreateInfoResponse() {
        return new CreateInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteSystemResponse }
     * 
     */
    public DeleteSystemResponse createDeleteSystemResponse() {
        return new DeleteSystemResponse();
    }

    /**
     * Create an instance of {@link CreateInfoByObjectResponse }
     * 
     */
    public CreateInfoByObjectResponse createCreateInfoByObjectResponse() {
        return new CreateInfoByObjectResponse();
    }

    /**
     * Create an instance of {@link CreateSystem }
     * 
     */
    public CreateSystem createCreateSystem() {
        return new CreateSystem();
    }

    /**
     * Create an instance of {@link CreateInfo }
     * 
     */
    public CreateInfo createCreateInfo() {
        return new CreateInfo();
    }

    /**
     * Create an instance of {@link UpdateSystemResponse }
     * 
     */
    public UpdateSystemResponse createUpdateSystemResponse() {
        return new UpdateSystemResponse();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link FlowData.Tasks }
     * 
     */
    public FlowData.Tasks createFlowDataTasks() {
        return new FlowData.Tasks();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInfoByObjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "createInfoByObjectResponse")
    public JAXBElement<CreateInfoByObjectResponse> createCreateInfoByObjectResponse(CreateInfoByObjectResponse value) {
        return new JAXBElement<CreateInfoByObjectResponse>(_CreateInfoByObjectResponse_QNAME, CreateInfoByObjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "createSystem")
    public JAXBElement<CreateSystem> createCreateSystem(CreateSystem value) {
        return new JAXBElement<CreateSystem>(_CreateSystem_QNAME, CreateSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "createInfo")
    public JAXBElement<CreateInfo> createCreateInfo(CreateInfo value) {
        return new JAXBElement<CreateInfo>(_CreateInfo_QNAME, CreateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "updateSystemResponse")
    public JAXBElement<UpdateSystemResponse> createUpdateSystemResponse(UpdateSystemResponse value) {
        return new JAXBElement<UpdateSystemResponse>(_UpdateSystemResponse_QNAME, UpdateSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInfoByObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "createInfoByObject")
    public JAXBElement<CreateInfoByObject> createCreateInfoByObject(CreateInfoByObject value) {
        return new JAXBElement<CreateInfoByObject>(_CreateInfoByObject_QNAME, CreateInfoByObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "createSystemResponse")
    public JAXBElement<CreateSystemResponse> createCreateSystemResponse(CreateSystemResponse value) {
        return new JAXBElement<CreateSystemResponse>(_CreateSystemResponse_QNAME, CreateSystemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "deleteSystem")
    public JAXBElement<DeleteSystem> createDeleteSystem(DeleteSystem value) {
        return new JAXBElement<DeleteSystem>(_DeleteSystem_QNAME, DeleteSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "updateSystem")
    public JAXBElement<UpdateSystem> createUpdateSystem(UpdateSystem value) {
        return new JAXBElement<UpdateSystem>(_UpdateSystem_QNAME, UpdateSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "createInfoResponse")
    public JAXBElement<CreateInfoResponse> createCreateInfoResponse(CreateInfoResponse value) {
        return new JAXBElement<CreateInfoResponse>(_CreateInfoResponse_QNAME, CreateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSystemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ideal.sh.cn.tc", name = "deleteSystemResponse")
    public JAXBElement<DeleteSystemResponse> createDeleteSystemResponse(DeleteSystemResponse value) {
        return new JAXBElement<DeleteSystemResponse>(_DeleteSystemResponse_QNAME, DeleteSystemResponse.class, null, value);
    }

}
