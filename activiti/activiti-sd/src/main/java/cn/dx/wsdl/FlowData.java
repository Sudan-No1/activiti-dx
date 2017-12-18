
package cn.dx.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flowData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="flowData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tasks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Task" type="{http://ideal.sh.cn.tc}task" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="uniCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowData", propOrder = {
    "tasks",
    "uniCode",
    "userAppName"
})
public class FlowData {

    protected FlowData.Tasks tasks;
    protected String uniCode;
    protected String userAppName;

    /**
     * ��ȡtasks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FlowData.Tasks }
     *     
     */
    public FlowData.Tasks getTasks() {
        return tasks;
    }

    /**
     * ����tasks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FlowData.Tasks }
     *     
     */
    public void setTasks(FlowData.Tasks value) {
        this.tasks = value;
    }

    /**
     * ��ȡuniCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniCode() {
        return uniCode;
    }

    /**
     * ����uniCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniCode(String value) {
        this.uniCode = value;
    }

    /**
     * ��ȡuserAppName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAppName() {
        return userAppName;
    }

    /**
     * ����userAppName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAppName(String value) {
        this.userAppName = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Task" type="{http://ideal.sh.cn.tc}task" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "task"
    })
    public static class Tasks {

        @XmlElement(name = "Task")
        protected List<Task> task;

        /**
         * Gets the value of the task property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the task property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTask().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Task }
         * 
         * 
         */
        public List<Task> getTask() {
            if (task == null) {
                task = new ArrayList<Task>();
            }
            return this.task;
        }

    }

}
