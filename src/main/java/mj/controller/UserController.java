package mj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import mj.domain.User;
import mj.service.UserService;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 处理/login请求
	 * */
	
	@RequestMapping(value="/login")
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session,HttpServletRequest request,
			 HttpServletResponse response){
		request.getSession().setAttribute("numb","未登录");
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		if(user != null){
			request.getSession().setAttribute("numb",user.getUser_id());
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			// 转发ss到main请求
			mv.setView(new RedirectView("index"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			mv.addObject("message","用户名或密码输入错误");
			mv.setViewName("login");
		}
		return mv;
	}
	@RequestMapping(value="/enrollbutton")
	public String enrollbutton(){
		return "enroll";
		
	}
	
	/*@RequestMapping(value="/detail1")
	public String detail1(){
		return "detail1";
		
	}*/
	@RequestMapping(value="/check")
	public String check(){
		return "check";
		
	}
	@RequestMapping(value="/updateuser1")
	public String updateuser1(){
		return "updateuser1";
		
	}
	
	@RequestMapping(value="/check1")
	public ModelAndView check1(String username,String question,String answer,
			ModelAndView mv,
			HttpSession session){
			User user=userService.protect(username, question, answer);
			if(user!=null){
				session.setAttribute("user", user);
				mv.setView(new RedirectView("updateuser1"));
			}
			else{
				mv.addObject("message","验证失败！");
				mv.setViewName("check");
			}
			return mv;
		}
	
	@RequestMapping(value="/updateuser")
	public ModelAndView updateuser(ModelAndView mv,String id,
			String name,String pwd,String sex,String age,String tel,String que,String anw){
		User updateuser=userService.updateuser(id,name,pwd,sex,age,tel,que,anw);
		mv.setViewName("readuser");
		return mv;
	}
	
	@RequestMapping(value="/readuser")
	public String readuser(){
		return "readuser";
		
	}
	
	@RequestMapping(value="/read")
	public ModelAndView read(String username,String question,String answer,
			ModelAndView mv,
			HttpSession session){
			User user=userService.protect(username, question, answer);
			if(user!=null){
				session.setAttribute("user", user);
				mv.setView(new RedirectView("readuser"));
			}
			else{
				mv.addObject("message","验证失败！");
				mv.setViewName("check");
			}
			return mv;
		}
	
	@RequestMapping(value="/msuccess")
	public String msuccess(){
		return "msuccess";
		
	}
	
	@RequestMapping(value="/udelete")
	public ModelAndView deleteuser(ModelAndView mv,String id){
		userService.deleteuser(id);
		mv.setViewName("msuccess");
		return mv;
	}
	
	@RequestMapping(value="/ifindpwd",method=RequestMethod.POST)
	public ModelAndView find(String username,String question,String answer,
		ModelAndView mv,
		HttpSession session){
		User user=userService.protect(username, question, answer);
		if(user!=null){
			session.setAttribute("user", user);
			mv.setView(new RedirectView("readuser"));
		}
		else{
			mv.addObject("message","验证失败！");
			mv.setViewName("backpwd");
		}
		return mv;
	}
	
	@RequestMapping(value="/backpwd")
	public String backpwd(){
		return "backpwd";
		
	}
	
	@RequestMapping(value="/p-update")
	public String pupdate(){
		return "p-update";
		
	}
	
	@RequestMapping(value="/updatepwd")
	public ModelAndView updatepwd(ModelAndView mv,HttpSession session,HttpServletRequest request,String password){
		String user_id=(String) session.getAttribute("numb");//获取用户id
		userService.updatepwd(password, user_id);
		mv.setViewName("login");
		return mv;
	}
	
	
}

	


