package mj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mj.domain.User;
import mj.service.EnrollService;
import mj.service.UserService;

@Controller
public class EnrollerController {

	@Autowired
	@Qualifier("enrollService")
	private EnrollService enrollService;
	
	@RequestMapping(value="/enroll")
	public ModelAndView enroll(ModelAndView mv,String id,
			String name,String pwd,String sex,String age,
			String tel,String que,String anw){
		User enroll=enrollService.enroll(id,name,pwd,sex,age,tel,que,anw);
		mv.setViewName("login");
		return mv;
	}
}
