package test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import mj.domain.User;
import mj.service.UserService;



@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})  
public class UserTest extends AbstractJUnit4SpringContextTests{
	@Autowired 
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
		}
	
	/*@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}*/
	
	
	
	@Test
	public void testLogin() {
		String loginname="sun";
		String password="456";
		User userlogin=userService.login(loginname, password);
		System.out.println(userlogin);
	}
	
	@Test
	public void testCheck() {
		String que="真实姓名";
		String anw="123";
		User usercheck=userService.check(que, anw);
		System.out.println(usercheck);
	}
	
	@Ignore
	@Test
	public void testUpdate() {
		/*String id, String name, String pwd, String sex, String age,
			String tel,String que,String anw */
		String id="3";
		String name="sun";
		String pwd="456";
		String sex="女";
		String age="31";
		String tel="13122222222";
		String que="真实姓名";
		String anw="123";
		User userupdate=userService.updateuser(id, name, pwd, sex, age, tel, que, anw);
		System.out.println(userupdate);
	}
	
	
	@Test
	public void testRead() {
		String id="3";
		List<User> userread=userService.readuser(id);
		System.out.println(userread);
	}
	
	@Test
	public void testProtect() {
		String username="sun";
		String question="真实姓名";
		String answer="123";
		User userpro=userService.protect(username, question, answer);
		System.out.println(userpro);
	}

}
