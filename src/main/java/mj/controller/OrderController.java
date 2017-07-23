package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mj.domain.Cart;
import mj.domain.Good;
import mj.domain.Order;
import mj.domain.User;
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
		int good_store=good_1.getGood_store()-good_number;
		int good_sell=good_1.getGood_sell()+good_number;
		String order_name=good_1.getGood_name();
		int order_price=Integer.parseInt(good_1.getGood_price())*good_number;
		String order_image=good_1.getGood_image();
		String order_status="待出库";
		Good updatess=orderService.updatestandse(good_store, good_sell, good_id);
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
			Integer order_id,String order_status,HttpSession session,HttpServletResponse response)throws Exception{
		//String user_id=(String) session.getAttribute("numb");
		Order updatestatus=orderService.updatestatus(order_status, order_id);
		Order select=orderService.selectRecord(order_id);
		String user_id=select.getOrder_uid();
		User user=orderService.selectuser(user_id);
		String user_email=user.getUser_email();
		User user2=orderService.sentemail(user_id, user_email);
		if(user2!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			builder.append("");
			url.append("您的订单是："+select.getOrder_status()+"");
			builder.append("");
			builder.append(""+url+"");
			System.out.print("builder输出");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("13270331659@163.com","123456cr");
			sendemail.setCharset("UTF-8");
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(user_email);
				sendemail.setFrom("13270331659@163.com");
				sendemail.setSubject("各书己见--订单状态通知");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.print("抛出异常");
			}
			//return "readorder";
		}else{
			
			response.getWriter().println("密码获取失败");
			System.out.print("密码获取失败");
		}	
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
