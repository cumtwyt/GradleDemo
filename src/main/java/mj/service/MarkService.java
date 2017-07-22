package mj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mj.domain.Mark;
import mj.domain.Order;

public interface MarkService {
	
	Mark findOrderById(int order_id);
	
	Mark updatemark(String mark_wl,String mark_zl,String mark_fw,int order_id);
	
	void insertmark(String user_id,int order_id,String mark_wl,String mark_zl,String mark_fw);
	
	List<Mark> readmark(String user_id);
	
	List<Mark> getAll();

	Order findByOId(int order_id);
}
