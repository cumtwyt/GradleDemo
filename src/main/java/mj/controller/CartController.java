package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mj.domain.Cart;
import mj.domain.Good;
import mj.service.CartService;


@Controller
public class CartController {

	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	/*
	 * 添加到购物车	
	 */
	@RequestMapping(value = "/intocart")
	public String save(String good_id,HttpSession session,HttpServletRequest request,Model model,Integer good_number) {
		String user_id=(String) session.getAttribute("numb");//获取用户id
		Good good_1=cartService.selectGood(good_id);
		String cart_name=good_1.getGood_name();
		int cart_price=Integer.parseInt(good_1.getGood_price());
		String cart_image=good_1.getGood_image();
		Cart cart=cartService.findGoodById(user_id,good_id);
		int b=0;
		if (cart != null) {
			b=cart.getCart_number();
			good_number=good_number+b;
			Cart cart3=cartService.updatecart(user_id, good_id, good_number);//如果存在则更新数量
		}else {			
			cartService.insertcart(user_id, good_id, good_number,cart_name,cart_price,cart_image);
		}
		List<Cart> save=cartService.readcart(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);
		// 跳转到cart页面
		return "cart";
	}
	
	/*
	 * 在购物车当前行中修改购物车
	 */
	@RequestMapping(value="rowupdate")
	public String rowupdate(Model model,
			String good_id,Integer good_number,HttpSession session){
		String user_id=(String) session.getAttribute("numb");
		Cart updatecart=cartService.updatecart(user_id,good_id,good_number);
		List<Cart> save=cartService.readcart(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);
		// 跳转到cart页面
		return "cart";
	}
	/*
	 * 在购物车当前行中删除购物车
	 */
	@RequestMapping(value="/rowdelete")
	public String rowdelete(Model model,HttpSession session,HttpServletRequest request,
			 HttpServletResponse response,String user_id,String good_id){
		user_id=(String) session.getAttribute("numb");
		cartService.rowdelete(user_id, good_id);
		List<Cart> save=cartService.readcart(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);
		// 跳转到cart页面
		return "cart";
	}
	
}
