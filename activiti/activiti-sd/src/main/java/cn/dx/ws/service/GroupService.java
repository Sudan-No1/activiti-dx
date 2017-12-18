package cn.dx.ws.service;

import javax.jws.WebService;

@WebService(name = "GroupService", // 暴露服务名称
targetNamespace = "http://service.ws.dx.cn/"// 命名空间,一般是接口的包名倒序
)
public interface GroupService {
	
	public String addDept(String orgCode, String orgname, String parentOrgCode, String sslkey);

	public String updateDept(String orgCode, String orgname, String parentOrgCode, String sslkey);

	public String delDept(String orgCode, String sslkey);
}
