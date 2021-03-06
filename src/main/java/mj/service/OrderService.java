package mj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Cart;
import mj.domain.Good;
import mj.domain.Order;
import mj.domain.User;

public interface OrderService {
	List<Order> getAll();
	
	Good selectGood(String good_id);
	
	void insertorder(String user_id,String good_id,String order_name,int order_price,
			int good_number,String order_image,@Param("order_status")String order_status);
	
	Order findGoodById(String user_id,String good_id);
	
	Order updatenumber(String user_id,String good_id,Integer good_number);
	
	List<Order> readorder(String user_id);
	
	Order updatestatus(String order_status,Integer order_id);
	
	List<Order> selectById(int order_id);
	
	Good updatestandse(int good_store,int good_sell,String good_id);
	
	Order selectRecord(int order_id);
	
	User selectuser(String user_id);
	
	User sentemail(String user_id,String user_email);
	

}
