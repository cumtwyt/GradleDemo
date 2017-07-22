package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Cart;
import mj.domain.Good;
import mj.domain.Order;



public interface OrderMapper {
	@Select("select * from tb_order")
	List<Order> findAll();
	
	@Select("select * from tb_good where good_id=#{good_id}")
	Good selectGood(@Param("good_id")String good_id);
	
	@Select("select * from tb_order where order_uid=#{user_id} and order_gid=#{good_id}")
	Order findGoodById(@Param("user_id")String user_id,@Param("good_id")String good_id);
	
	@Select("update tb_order set order_number=#{good_number} where order_uid=#{user_id} and order_gid=#{good_id}")
	Order updatenumber(@Param("user_id")String user_id,@Param("good_id")String good_id,@Param("good_number")Integer good_number);
	
	@Insert("insert into tb_order(order_uid,order_gid,order_gname,order_price,order_number,order_image,order_status) "
			+ "				values(#{user_id},#{good_id},#{order_name},#{order_price},#{good_number},#{order_image},#{order_status})")
	void insertorder(@Param("user_id")String user_id,@Param("good_id")String good_id,@Param("order_name")String order_gname,
			@Param("order_price")int order_price,@Param("good_number")int good_number,
			@Param("order_image")String order_image,@Param("order_status")String order_status);
	
	@Select("select * from tb_order where order_uid=#{user_id}")
	List<Order> readorder(@Param("user_id")String user_id);
	
	@Select("update tb_order set order_status=#{order_status} where order_id=#{order_id}")
	Order updatestatus(@Param("order_status")String order_status,@Param("order_id")Integer order_id);
	
	@Select("select * from tb_order where order_id=#{order_id}")
	List<Order> selectById(@Param("order_id")int order_id);
	
	@Select("update tb_good set good_store=#{good_store},good_sell=#{good_sell} where good_id=#{good_id}")
	Good updatestandse(@Param("good_store")int good_store,@Param("good_sell")int good_sell,@Param("good_id")String good_id);
	
	
	
}


