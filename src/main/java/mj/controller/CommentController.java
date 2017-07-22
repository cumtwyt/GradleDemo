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

import mj.domain.Comment;
import mj.domain.Good;
import mj.service.CommentService;






/**
 * 处理物品请求控制器
 * */
@Controller
public class CommentController {
	
	/**
	 * 自动注入GoodService
	 * */
	@Autowired
	@Qualifier("commentService")
	private CommentService commentService;
	
	/*
	@RequestMapping(value="/addcomment")
	public String addcomment(){
		return "addcomment";
	}
	*/
	
	@RequestMapping(value="/addcom")
	public String addcomment(Model model,HttpSession session,
			String good_id,String com_con,String com_image){
		String user_id=(String) session.getAttribute("numb");
		commentService.addcomment(user_id, good_id, com_con, com_image);;
		List<Comment> comment_list = commentService.findComByGId(good_id);
		// 将物品集合添加到model当中
		model.addAttribute("comment_list", comment_list);
		return "comment";
	}
	
	@RequestMapping(value="/readcomment")
	 public String main(Model model){
		// 获得所有物品
		List<Comment> comment_list1 = commentService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("comment_list1", comment_list1);
		return "readcomment";
	}
	
	@RequestMapping(value="/deletecomment")
	public String deletecomment(){
		return "deletecomment";
	}
	
	@RequestMapping(value="/deletecom")
	public String deletecom(Model model,String id){
		commentService.deletecomment(id);
		List<Comment> comment_list1 = commentService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("comment_list1", comment_list1);
		return "readcomment";
	}
	
	@RequestMapping(value="/comment")
	 public String main(Model model,String gid){
		// 获得所有物品
		List<Comment> comment_list = commentService.findComByGId(gid);
		// 将物品集合添加到model当中
		model.addAttribute("comment_list", comment_list);
		return "comment";
	}
	
	
	

}
