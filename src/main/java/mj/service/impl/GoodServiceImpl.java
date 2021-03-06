package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Good;
import mj.mapper.GoodMapper;
import mj.service.GoodService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodService")
public class GoodServiceImpl implements GoodService{
	@Autowired
	private GoodMapper goodMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAll() {
		return goodMapper.findAll();
	}
	
	
	
	
	@Override
	public void deletegood(String id) {
		goodMapper.deletegood(id);
	}

	@Override
	public List<Good> selectSubjectBySId(int sid) {
		// TODO Auto-generated method stub
		return goodMapper.selectSubjectBySId(sid);
	}

	@Override
	public Good selectById(String id) {
		// TODO Auto-generated method stub
		return goodMapper.selectById(id);
	}



	@Override
	public Good addgood(String id, String name, String price, String remark, String image, String image1, String image2,
			int subjectid,int store,int sell) {
		// TODO Auto-generated method stub
		return goodMapper.addgood(id, name, price, remark, image, image1, image2, subjectid,store,sell);
	}




	@Override
	public Good updategood(String id, String price, String remark, String image) {
		// TODO Auto-generated method stub
		return goodMapper.updategood(id, price, remark, image);
	}


}
