package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import mj.domain.Cart;
import mj.domain.Good;
import mj.domain.Order;
import mj.service.OrderService;



@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})
public class OrderTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private OrderService orderService;
	
	public void setGoodService(OrderService orderService) {
		this.orderService = orderService;
		}
	
	@Test
	public void testList() {
		List<Order> list=orderService.getAll();
		System.out.println(list);
	}
	
	@Test
	public void testSelectGood() {
		String good_id="4";
		Good good=orderService.selectGood(good_id);
		System.out.println(good);
	}

}
