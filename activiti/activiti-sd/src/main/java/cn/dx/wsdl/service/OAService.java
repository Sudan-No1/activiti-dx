package cn.dx.wsdl.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import cn.dx.domain.XmlBuilder;

@Service
public class OAService {
	

	public String addTask(String tasksID,
			String title,
			String url,
			String createUser,
			String createUserName,
			String createOrg,
			String receiveUser,
			String receiveUserName
			){
		/*ICreateInfoServiceService mais = new ICreateInfoServiceService();
		ICreateInfoService servicePort = mais.getICreateInfoServicePort();*/
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createDate = sdf.format(date);
		String flowDataXml = new XmlBuilder()
								 	.tasksID(tasksID)
								 	.synType("1")
								 	.tasksType("1")
								 	.title(title)
								 	.url(url)
								 	.createDate(createDate)
								 	.createUser(createUser)
								 	.createUserName(createUserName)
								 	.createOrg(createOrg)
								 	.receiveUser(receiveUser)
								 	.receiveUserName(receiveUserName)
								 	.type("0")
								 	.build();
		return flowDataXml;
		/* String createInfo = servicePort.createInfo(flowDataXml);
		 return createInfo;*/
	}
	
	public String completeTask(String tasksID,
			String title,
			String url,
			String createUser,
			String createUserName,
			String createOrg,
			String receiveUser,
			String receiveUserName){
		/*ICreateInfoServiceService mais = new ICreateInfoServiceService();
		ICreateInfoService servicePort = mais.getICreateInfoServicePort();*/
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createDate = sdf.format(date);
		String flowDataXml = new XmlBuilder()
								 	.tasksID(tasksID)
								 	.synType("3")
								 	.tasksType("3")
								 	.title(title)
								 	.url(url)
								 	.createDate(createDate)
								 	.createUser(createUser)
								 	.createUserName(createUserName)
								 	.createOrg(createOrg)
								 	.receiveUser(receiveUser)
								 	.receiveUserName(receiveUserName)
								 	.type("1")
								 	.build();
		 /*String createInfo = servicePort.createInfo(flowDataXml);
		 return createInfo;*/
		return flowDataXml;
		
	}
	

}
