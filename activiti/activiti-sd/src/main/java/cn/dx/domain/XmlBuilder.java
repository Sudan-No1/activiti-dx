package cn.dx.domain;

import java.io.IOException;
import java.io.StringWriter;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class XmlBuilder {
    	private Element tasks;
    	private Element root;
		
    	public XmlBuilder(){
    		root = new Element("synXml");
    		root.addContent(new Element("userAppName").setText("房屋三维可视化"));//固定
    		root.addContent(new Element("uniCode").setText("M01050"));//固定
    		Element flowData = new Element("flowData");
    		tasks = new Element("tasks");
    		root.addContent(flowData);
    		flowData.addContent(tasks);
    		
    	}
    	
    	public XmlBuilder tasksID(String val) {
    		tasks.addContent(new Element("tasksID").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder synType(String val) {
    		tasks.addContent(new Element("synType").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder tasksType(String val) {
    		tasks.addContent(new Element("tasksType").setText(val));
    		return this;
    	}
    	public XmlBuilder title(String val) {
    		tasks.addContent(new Element("title").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder url(String val) {
    		tasks.addContent(new Element("url").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder createDate(String val) {
    		tasks.addContent(new Element("createDate").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder createUser(String val) {
    		tasks.addContent(new Element("createUser").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder createUserName(String val) {
    		tasks.addContent(new Element("createUserName").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder createOrg(String val) {
    		tasks.addContent(new Element("createOrg").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder receiveUser(String val) {
    		tasks.addContent(new Element("receiveUser").setText(val));
    		return this;
    	}
    	public XmlBuilder receiveUserName(String val) {
    		tasks.addContent(new Element("receiveUserName").setText(val));
    		return this;
    	}
    	
    	public XmlBuilder type(String val) {
    		tasks.addContent(new Element("type").setText(val));
    		return this;
    	}
    	
    	public String build() {
    		Document document=new Document();
    		document.setRootElement(root);
    		XMLOutputter outputter=new XMLOutputter();
    		Format format = Format.getPrettyFormat();
    		format.setEncoding("GB2312");
    		outputter.setFormat(format);//设置文本格式
    		StringWriter out = new StringWriter();   
    		try {
    			outputter.output(document,out);
    		} catch (IOException e) {
    			e.printStackTrace();
    		}  
    		return out.toString();   
    	}
}
