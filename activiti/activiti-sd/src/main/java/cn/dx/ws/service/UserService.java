package cn.dx.ws.service;

import javax.jws.WebService;

@WebService(name = "UserService", // 暴露服务名称
targetNamespace = "http://service.ws.dx.cn/"// 命名空间,一般是接口的包名倒序
)
public interface UserService {
	
	public String addUser(String loginname, String username, String orgname, String department, String employeenumber,
			String email, String sslkey);

	public String editUser(String loginname, String username, String orgname, String department, String employeenumber,
			String email, String sslkey);

	public String deleteUser(String loginname, String sslkey);
}
