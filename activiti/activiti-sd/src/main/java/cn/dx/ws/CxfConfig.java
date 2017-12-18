package cn.dx.ws;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.dx.ws.service.GroupService;
import cn.dx.ws.service.UserService;

@Configuration
public class CxfConfig {
	@Autowired
	private Bus bus;

	@Autowired
	UserService userService;
	
	@Autowired
	GroupService groupService;

	/** JAX-WS **/
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, userService);
		EndpointImpl endpoint2 = new EndpointImpl(bus, groupService);
		endpoint.publish("/UserService");
		endpoint2.publish("/GroupService");
		return endpoint;
	}
}