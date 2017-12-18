
package cn.dx.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>createInfoByObject complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="createInfoByObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flowData" type="{http://ideal.sh.cn.tc}flowData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createInfoByObject", propOrder = {
    "flowData"
})
public class CreateInfoByObject {

    protected FlowData flowData;

    /**
     * ��ȡflowData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FlowData }
     *     
     */
    public FlowData getFlowData() {
        return flowData;
    }

    /**
     * ����flowData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FlowData }
     *     
     */
    public void setFlowData(FlowData value) {
        this.flowData = value;
    }

}
