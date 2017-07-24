package mj.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
	*/
	
	
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
	
	
	@RequestMapping(value="/addcom",method=RequestMethod.POST)
	public String addcomment(HttpServletRequest request,Model model,HttpSession session,
			String good_id,String com_con,@RequestParam("file") MultipartFile file)throws Exception{
		String user_id=(String) session.getAttribute("numb");
		if(!file.isEmpty()){
			// 上传文件路径
			String path = request.getServletContext().getRealPath(
	                "/images/");
			// 上传文件名
			String filename = file.getOriginalFilename();
		    File filepath = new File(path,filename);
			// 判断路径是否存在，如果不存在就创建一个
	        if (!filepath.getParentFile().exists()) { 
	        	filepath.getParentFile().mkdirs();
	        }
	        // 将上传文件保存到一个目标文件当中
			file.transferTo(new File(path+File.separator+ filename));
			String com_image=filepath.getName();
			commentService.addcomment(user_id, good_id, com_con, com_image);
			List<Comment> comment_list = commentService.findComByGId(good_id);
			// 将物品集合添加到model当中
			model.addAttribute("comment_list", comment_list);
			return "comment";
		}else{
			return "comment";
		}
		
		//commentService.addcomment(user_id, good_id, com_con, com_image);
		//List<Comment> comment_list = commentService.findComByGId(good_id);
		// 将物品集合添加到model当中
		//model.addAttribute("comment_list", comment_list);
		//return "comment";
	}
	
	
	

}
