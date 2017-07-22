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
import mj.service.CartService;



@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})
public class CartTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private CartService cartService;
	
	public void setGoodService(CartService cartService) {
		this.cartService = cartService;
		}
	
	@Test
	public void testSelectGood() {
		String good_id="4";
		Good good=cartService.selectGood(good_id);
		System.out.println(good);
	}
	
	@Test
	public void testList() {
		String user_id="3";
		List<Cart> goodlist=cartService.readcart(user_id);
		System.out.println(goodlist);
	}
	
	@Test
	public void testFindGoodById() {
		String user_id="3";
		String good_id="2";
		Cart goodlist1=cartService.findGoodById(user_id, good_id);
		System.out.println(goodlist1);
	}
	
	//findGoodById

}
