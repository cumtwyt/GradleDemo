package mj.service;

import java.util.List;

import mj.domain.Cart;
import mj.domain.Good;

public interface CartService {
	Good selectGood(String good_id);
	
	void insertcart(String user_id,String good_id,int good_number,String cart_name,int cart_price,String cart_image);
	
	Cart updatecart(String user_id,String good_id,Integer good_number);
	
	List<Cart> readcart(String user_id);

	Cart getAll(String user_id,String good_name);
	
	void deletecart(String user_id);
	
	Cart findGoodById(String user_id,String good_id);
	
	void rowdelete(String user_id,String good_id);


}
