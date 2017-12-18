package cn.dx.ws.service.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dx.dao.CmdbDao;
import cn.dx.ws.service.UserService;

@WebService(serviceName = "UserService", // 与接口中指定的name一致
targetNamespace = "http://service.dx.com//", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "cn.dx.ws.service.UserService"// 接口地址
)
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private CmdbDao cmdbDao;
	
	@Override
	public String addUser(String loginname, String username, String orgname, 
			String department, String employeenumber,String email, String sslkey) {
		Object[] params = new Object[7];
		params[0] = loginname;
		params[1] = loginname;
		params[2] = username;
		params[3] = orgname;
		params[4] = department;
		params[5] = employeenumber;
		params[6] = email;
		cmdbDao.addCTUser(params);
		return null;
	}

	@Override
	public String editUser(String loginname, String username, String orgname, 
			String department, String employeenumber,String email, String sslkey) {
		Object[] params = new Object[6];
		params[0] = username;
		params[1] = orgname;
		params[2] = department;
		params[3] = employeenumber;
		params[4] = email;
		params[5] = loginname;
		cmdbDao.updateCTUser(params);
		return null;
	}

	@Override
	public String deleteUser(String loginname, String sslkey) {
		cmdbDao.deleteCTUser(loginname);
		return null;
	}

}
