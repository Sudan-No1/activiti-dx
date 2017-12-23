package cn.dx.utils;

import java.io.IOException;
import java.io.StringWriter;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class XmlUtil {
	
	
	/*public static void main(String[] args) {
		Document document=new Document();
		Element root = new Element("synXml");
		root.addContent(new Element("userAppName").setText("房屋三维可视化"));//固定
		root.addContent(new Element("uniCode").setText("M01050"));//固定
		Element flowData = new Element("flowData");
		Element tasks = new Element("tasks");
		root.addContent(flowData);
		flowData.addContent(tasks);
		document.setRootElement(root);
		tasks.addContent(new Element("tasksID").setText("44541111111111111"));
		tasks.addContent(new Element("synType").setText("1"));
		tasks.addContent(new Element("tasksType").setText("1"));
		tasks.addContent(new Element("title").setText("申请验收"));
		tasks.addContent(new Element("url").setText("http://10.7.93.84:9080/rpm/acceptance_add_forward?pid=1"));
		tasks.addContent(new Element("createDate").setText("2014-02-27"));
		tasks.addContent(new Element("createUser").setText("linlian"));
		tasks.addContent(new Element("createUserName").setText("林联"));
		tasks.addContent(new Element("createOrg").setText("研究院/中国电信产品开发中心"));
		tasks.addContent(new Element("receiveUser").setText("linlian"));
		tasks.addContent(new Element("receiveUserName").setText("林联"));
		tasks.addContent(new Element("type").setText("0"));
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
		String sReturn=out.toString();   
		System.out.println(sReturn);
	}*/
}
