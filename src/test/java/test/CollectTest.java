package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import mj.domain.Collect;
import mj.domain.Good;
import mj.service.CartService;
import mj.service.CollectService;


@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})
public class CollectTest {
	
	@Autowired
	private CollectService collectService;
	
	public void setGoodService(CollectService collectService) {
		this.collectService = collectService;
		}
	
	@Test
	public void testselectGood() {
		String good_id="4";
		Good good=collectService.selectGood(good_id);
		System.out.println(good);
	}
	
	@Test
	public void testfindGoodById() {
		String user_id="3";
		String good_id="4";
		Collect collect=collectService.findGoodById(user_id, good_id);
		System.out.println(collect);
	}
	
	@Test
	public void testreadcollect() {
		String user_id="3";
		List<Collect> collect1=collectService.readcollect(user_id);
		System.out.println(collect1);
	}

}
