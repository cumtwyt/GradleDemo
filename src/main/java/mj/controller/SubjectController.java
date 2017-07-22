package mj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mj.domain.Good;
import mj.domain.Subject;
import mj.service.SubjectService;





/**
 * 处理物品请求控制器
 * */
@Controller
public class SubjectController {
	
	/**
	 * 自动注入GoodService
	 * */
	@Autowired
	@Qualifier("subjectService")
	private SubjectService subjectService;
	
	@RequestMapping(value="/readsubject")
	 public String main(Model model){
		// 获得所有物品
		List<Subject> subject_list = subjectService.getAll();
		// 将物品集合添加到model当中
		model.addAttribute("subject_list", subject_list);
		// 跳转到shop页面
		return "readsubject";
	}
	
	@RequestMapping(value="/sadd")
	public ModelAndView addbook(ModelAndView mv,int id,
			String name,String detail){
		Subject addsubject=subjectService.addsubject(id,name,detail);
		mv.setViewName("msuccess");
		return mv;
	
	}
	
	@RequestMapping(value="/supdate")
	public ModelAndView updatebook(ModelAndView mv,int id,
			String name,String detail){
		Subject updatesubject=subjectService.updatesubject(id,name,detail);
		mv.setViewName("msuccess");
		return mv;
	}
	
	@RequestMapping(value="/sdelete")
	public ModelAndView deletebook(ModelAndView mv,String name){
		subjectService.deletesubject(name);
		mv.setViewName("msuccess");
		return mv;
	}
	
	

}
