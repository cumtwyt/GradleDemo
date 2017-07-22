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

import mj.domain.Good;
import mj.service.GoodService;
import mj.service.SubjectService;


@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:/WEB-INF/springmvc-config.xml","classpath*:/WEB-INF/applicationContext.xml"})
public class GoodTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private GoodService goodService;
	
	public void setGoodService(GoodService goodService) {
		this.goodService = goodService;
		}
	
	@Test
	public void testList() {
		List<Good> goodlist=goodService.getAll();
		System.out.println(goodlist);
	}
	
	@Test
	public void testListBySubjectId() {
		int sid=3;
		List<Good> goodlist1=goodService.selectSubjectBySId(sid);
		System.out.println(goodlist1);
	}
	
	@Test
	public void testListById() {
		String id="3";
		Good good=goodService.selectById(id);
		System.out.println(good);
	}
	
	@Test
	public void testUpdate() {
		String id="6";
		String name="聊斋志异";
		String price="33";
		String remark="miaoshu";
		String image="liaozhaizhiyi.jpg";
		int subjectid=4;
		Good good=goodService.updategood(id, name, price, remark, image, subjectid);
		//System.out.println(good);
	}

}
