package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Cart;
import mj.domain.Good;
import mj.mapper.CartMapper;
import mj.service.CartService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartMapper cartMapper;


	
	@Override
	public void insertcart(String user_id, String good_id, int good_number,String cart_name,int cart_price,String cart_image) {
		// TODO Auto-generated method stub
		 cartMapper.insertcart(user_id, good_id, good_number,cart_name,cart_price,cart_image);
	}

	@Override
	public List<Cart> readcart(String user_id) {
		return cartMapper.readcart(user_id);
	}

	@Override
	public Cart updatecart(String user_id,String good_id,Integer good_number) {
		return cartMapper.updatecart(user_id,good_id,good_number);
	}

	@Override
	public  Cart getAll(String user_id, String good_name) {
		return cartMapper.getAll(user_id, good_name);
	}

	@Override
	public void deletecart(String user_id) {
		// TODO Auto-generated method stub
		cartMapper.deletecart(user_id);
		
	}

	@Override
	public Cart findGoodById(String good_id,String user_id) {
		// TODO Auto-generated method stub
		return cartMapper.findGoodById(user_id,good_id);
	}

	@Override
	public Good selectGood(String good_id) {
		// TODO Auto-generated method stub
		return cartMapper.selectGood(good_id);
	}

	@Override
	public void rowdelete(String user_id, String good_id) {
		// TODO Auto-generated method stub
		cartMapper.rowdelete(user_id, good_id);
		
	}

	



}
