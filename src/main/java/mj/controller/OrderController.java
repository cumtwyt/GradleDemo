package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mj.domain.Cart;
import mj.domain.Good;
import mj.domain.Order;
import mj.service.OrderService;


@Controller
public class OrderController {
	
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;

	/**
	 * 处理/main请求
	 * */
	
	
	@RequestMapping(value = "/intoorder")
	public String save(String good_id,HttpSession session,HttpServletRequest request,Model model,Integer good_number) {
		String user_id=(String) session.getAttribute("numb");//获取用户id
		Good good_1=orderService.selectGood(good_id);
		String order_name=good_1.getGood_name();
		int order_price=Integer.parseInt(good_1.getGood_price());
		String order_image=good_1.getGood_image();
		String order_status="待出库";
		Order order=orderService.findGoodById(user_id,good_id);
		int b=0;
		if (order != null) {
			b=order.getOrder_number();
			good_number=good_number+b;
			Order order3=orderService.updatenumber(user_id, good_id, good_number);//如果存在则更新数量
		}else {			
			orderService.insertorder(user_id, good_id, order_name,order_price,good_number,order_image,order_status);
		}
		List<Order> save=orderService.readorder(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);
		// 跳转到cart页面
		return "order";
	}
	
	@RequestMapping(value="/updatestatus")
	public String updatestatus(Model model,
			Integer order_id,String order_status,HttpSession session){
		//String user_id=(String) session.getAttribute("numb");
		Order updatestatus=orderService.updatestatus(order_status, order_id);
		List<Order> order_list =orderService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到cart页面
		return "readorder";
	}
	
	@RequestMapping(value="/readorder")
	 public String main(Model model){
		// 获得所有物品
		List<Order> order_list =orderService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("order_list", order_list);
		// 跳转到shop页面
		return "readorder";
	}
	
	@RequestMapping(value="/order")
	public String order(Model model,HttpSession session){
		String user_id=(String) session.getAttribute("numb");
		List<Order> save=orderService.readorder(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);   
		return "order";
	}
	
	@RequestMapping(value="/makesure")
	public String makesure(Model model,
			Integer order_id,String order_status,HttpSession session){
		String user_id=(String) session.getAttribute("numb");
		Order updatestatus=orderService.updatestatus(order_status, order_id);
		List<Order> save=orderService.readorder(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);
		return "order";
	}
	
	@RequestMapping(value="/selectorder")
	public String selectorder(Model model,int order_id){
		List<Order> save=orderService.selectById(order_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);   
		return "order";
	}
	
	
	
	
}
