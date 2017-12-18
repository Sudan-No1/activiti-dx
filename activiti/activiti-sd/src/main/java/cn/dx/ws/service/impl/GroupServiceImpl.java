package cn.dx.ws.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.ideal.sso.SsoUtil;

import cn.dx.ws.service.GroupService;

@WebService(serviceName = "GroupService", // 与接口中指定的name一致
targetNamespace = "http://service.dx.com//", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "cn.dx.ws.service.GroupService"// 接口地址
)
@Service
public class GroupServiceImpl implements GroupService{

	@Override
	public String addDept(String orgCode, String orgname, String parentOrgCode, String sslkey) {
		 String[] strings = null;
		try {
			strings = SsoUtil.getUserInfo(sslkey, "sh.ctc.com", "dxda");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		boolean boo = "46!99A.F37B ".equals(strings[0]);
		if(boo){
			
			return "1";
		}

		return "0";
	}

	@Override
	public String updateDept(String orgCode, String orgname, String parentOrgCode, String sslkey) {
		return null;
	}

	@Override
	public String delDept(String orgCode, String sslkey) {
		return null;
	}

}
