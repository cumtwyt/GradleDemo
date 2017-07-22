package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import mj.domain.Mark;
import mj.service.MarkService;



@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})
public class MarkTest {
	
	@Autowired
	private MarkService markService;
	
	public void setGoodService(MarkService markService) {
		this.markService = markService;
		}
	

	@Test
	public void testfindOrderById() {
		int order_id=2017071911;
		Mark order=markService.findOrderById(order_id);
		System.out.println(order);
	}
	
	@Test
	public void testreadmark() {
		String user_id="3";
		List<Mark> order1=markService.readmark(user_id);
		System.out.println(order1);
	}
	
	@Test
	public void testgetAll() {
		List<Mark> order2=markService.getAll();
		System.out.println(order2);
	}
	
	
	

}
