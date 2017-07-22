package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Mark;
import mj.domain.Order;
import mj.mapper.MarkMapper;
import mj.service.MarkService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("markService")

public class MarkServiceImpl implements MarkService{
	
	@Autowired
	private MarkMapper markMapper;

	@Override
	public Mark findOrderById(int order_id) {
		// TODO Auto-generated method stub
		return markMapper.findOrderById(order_id);
	}

	@Override
	public Mark updatemark(String mark_wl, String mark_zl, String mark_fw, int order_id) {
		// TODO Auto-generated method stub
		return markMapper.updatemark(mark_wl, mark_zl, mark_fw, order_id);
	}

	@Override
	public void insertmark(String user_id, int order_id, String mark_wl, String mark_zl, String mark_fw) {
		// TODO Auto-generated method stub
		markMapper.insertmark(user_id, order_id, mark_wl, mark_zl, mark_fw);
	}

	@Override
	public List<Mark> readmark(String user_id) {
		// TODO Auto-generated method stub
		return markMapper.readmark(user_id);
	}

	@Override
	public List<Mark> getAll() {
		// TODO Auto-generated method stub
		return markMapper.findAll();
	}
	
	@Override
	public Order findByOId(int order_id) {
		// TODO Auto-generated method stub
		return markMapper.findByOId(order_id);
	}

}
