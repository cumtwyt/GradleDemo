package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import mj.domain.Collect;
import mj.domain.Good;
import mj.domain.User;
import mj.service.CollectService;

@Controller
public class CollectController {
	
	@Autowired
	@Qualifier("collectService")
	private CollectService collectService;
	/*
	 * 添加到收藏
	 */
	@RequestMapping(value = "/intocollect")
	public String save(String good_id,HttpSession session,HttpServletRequest request,Model model) {
		String user_id=(String) session.getAttribute("numb");//获取用户id
		Good good_1=collectService.selectGood(good_id);
		String collect_gname=good_1.getGood_name();
		int collect_price=Integer.parseInt(good_1.getGood_price());
		String collect_image=good_1.getGood_image();
		Collect collect=collectService.findGoodById(user_id,good_id);
		//int b=0;
		if (collect != null) {
			//b=cart.getCart_number();
			//good_number=good_number+b;
			//Cart cart3=cartService.updatecart(user_id, good_id, good_number);//如果存在则更新数量
		}else {			
			collectService.insertcollect(user_id, good_id, collect_gname, collect_price, collect_image);
		}
		List<Collect> save=collectService.readcollect(user_id);
		// 将物品集合添加到model当中
		model.addAttribute("save", save);
		// 跳转到cart页面
		return "collect";
	}
}
