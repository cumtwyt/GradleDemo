package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import mj.domain.Comment;
import mj.service.CommentService;



@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})
public class CommentTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	private CommentService commentService;
	
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
		}
	
	@Test
	public void testList() {
		List<Comment> List=commentService.getAll();
		System.out.println(List);
	}
	
	@Test
	public void testSelectComById() {
		String gid="1";
		List<Comment> List1=commentService.findComByGId(gid);
		System.out.println(List1);
	}
	
	

}
