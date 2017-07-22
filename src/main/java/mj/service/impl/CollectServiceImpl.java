package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Collect;
import mj.domain.Good;
import mj.mapper.CollectMapper;
import mj.service.CollectService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService{
	
	@Autowired
	private CollectMapper collectMapper;

	@Override
	public Good selectGood(String good_id) {
		// TODO Auto-generated method stub
		return collectMapper.selectGood(good_id);
	}

	@Override
	public Collect findGoodById(String user_id, String good_id) {
		// TODO Auto-generated method stub
		return collectMapper.findGoodById(user_id, good_id);
	}

	@Override
	public void insertcollect(String user_id, String good_id, String collect_gname, int collect_price,
			String collect_image) {
		// TODO Auto-generated method stub
		collectMapper.insertcollect(user_id, good_id, collect_gname, collect_price, collect_image);
		
	}

	@Override
	public List<Collect> readcollect(String user_id) {
		// TODO Auto-generated method stub
		return collectMapper.readcollect(user_id);
	}

}
