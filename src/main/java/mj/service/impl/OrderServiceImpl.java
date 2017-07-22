package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Cart;
import mj.domain.Good;
import mj.domain.Order;
import mj.mapper.OrderMapper;
import mj.service.OrderService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")

public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}

	@Override
	public Good selectGood(String good_id) {
		// TODO Auto-generated method stub
		return orderMapper.selectGood(good_id);
	}

	@Override
	public void insertorder(String user_id, String good_id, String order_name, int order_price, int good_number,
			String order_image, String order_status) {
		// TODO Auto-generated method stub
		orderMapper.insertorder(user_id, good_id, order_name, order_price, good_number, order_image, order_status);
	}

	@Override
	public Order findGoodById(String user_id, String good_id) {
		// TODO Auto-generated method stub
		return orderMapper.findGoodById(user_id, good_id);
	}

	@Override
	public Order updatenumber(String user_id, String good_id, Integer good_number) {
		// TODO Auto-generated method stub
		return orderMapper.updatenumber(user_id, good_id, good_number);
	}

	@Override
	public List<Order> readorder(String user_id) {
		// TODO Auto-generated method stub
		return orderMapper.readorder(user_id);
	}

	@Override
	public Order updatestatus(String order_status, Integer order_id) {
		// TODO Auto-generated method stub
		return orderMapper.updatestatus(order_status, order_id);
	}

	@Override
	public List<Order> selectById(int order_id) {
		// TODO Auto-generated method stub
		return orderMapper.selectById(order_id);
	}

	

	
	
	

}
