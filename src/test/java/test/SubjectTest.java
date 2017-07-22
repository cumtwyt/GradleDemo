package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import mj.domain.Subject;
import mj.service.SubjectService;



@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"}) 
public class SubjectTest extends AbstractJUnit4SpringContextTests{
	
	
	@Autowired
	private SubjectService subjectService;
	
	public void setSubjectService(SubjectService subjectService) {
		this.subjectService = subjectService;
		}
	
	
	@Test
	public void testList() {
		List<Subject> subjectlist=subjectService.getAll();
		System.out.println(subjectlist);
	}
	
	@Ignore
	@Test
	public void testAdd() {
		int id=6;
		String name="主题五";
		String detail="主题五细节";
		Subject subjectadd=subjectService.addsubject(id, name, detail);
		//assertEquals(null,subjectService.addsubject(id, name, detail));
		System.out.println(subjectadd);
	}
	
	/*
	@Test
	public void testdelete() {
		String name="主题六";
		assertEquals(null,subjectService.deletesubject(name));
		//subjectService.deletesubject(name);;
		//System.out.println(subjectlist);
	}
	*/



}
