package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import mj.domain.Manager;
import mj.service.ManagerService;





@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})
public class ManagerTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private ManagerService managerService;
	
	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
		}
	
	@Test
	public void testMLogin() {
		String managername="cr";
		String managerpwd="123";
		Manager mlogin=managerService.mlogin(managername, managerpwd);
		System.out.println(mlogin);
		
	}

}
