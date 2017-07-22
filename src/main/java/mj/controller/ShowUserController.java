package mj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mj.domain.User;
import mj.service.ShowUserService;



@Controller
public class ShowUserController {
	
	@Autowired
	@Qualifier("showuserService")
	private ShowUserService showuserService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/showuser")
	 public String main(Model model){
		// 获得所有物品
		List<User> user_list = showuserService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("user_list", user_list);
		// 跳转到shop页面
		return "showuser";
	}
	
	@RequestMapping(value="/showuser1")
	 public String main1(Model model){
		// 获得所有物品
		List<User> user_list = showuserService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("user_list", user_list);
		// 跳转到shop页面
		return "showuser1";
	}
	
}
