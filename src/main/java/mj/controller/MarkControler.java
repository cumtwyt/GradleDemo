package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mj.domain.Mark;
import mj.domain.Order;
import mj.domain.User;
import mj.service.MarkService;

@Controller
public class MarkControler {
	
	@Autowired
	@Qualifier("markService")
	private MarkService markService;
	
	@RequestMapping(value="/addmark")
	public String addmark(Model model,int order_id){
		Order order=markService.findByOId(order_id);
		// 将物品集合添加到model当中
		model.addAttribute("order", order);   
		return "addmark";
	}
	
	
	@RequestMapping(value = "/intomark")
	public String save(int order_id,HttpSession session,HttpServletRequest request,Model model,
			String mark_wl,String mark_zl,String mark_fw) {
		String user_id=(String) session.getAttribute("numb");//获取用户id
		
		Mark mark=markService.findOrderById(order_id);
		
		if (mark != null) {
			Mark mark3=markService.updatemark(mark_wl, mark_zl, mark_fw, order_id);//如果存在则更新数量
		}else {			
			markService.insertmark(user_id, order_id,mark_wl,mark_zl,mark_fw);
		}
		List<Mark> save=markService.readmark(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);
		// 跳转到cart页面
		return "mark";
	}
	
	
}
