package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Mark;
import mj.domain.Order;

public interface MarkMapper {
	
	@Select("select * from tb_mark where order_id=#{order_id}")
	Mark findOrderById(@Param("order_id")int order_id);
	
	@Insert("insert into tb_mark(user_id,order_id,mark_wl,mark_zl,mark_fw) "
			+ "				values(#{user_id},#{order_id},#{mark_wl},#{mark_zl},#{mark_fw})")
	void insertmark(@Param("user_id")String user_id,@Param("order_id")int order_id,@Param("mark_wl")String mark_wl,
					@Param("mark_zl")String mark_zl,@Param("mark_fw")String mark_fw);
	
	@Select("update tb_mark set mark_wl=#{mark_wl},mark_zl=#{mark_zl},mark_fw=#{mark_fw} where order_id=#{order_id}")
	Mark updatemark(@Param("mark_wl")String mark_wl,@Param("mark_zl")String mark_zl,@Param("mark_fw")String mark_fw,@Param("order_id")int order_id);
	
	@Select("select * from tb_mark where user_id=#{user_id}")
	List<Mark> readmark(@Param("user_id")String user_id);
	
	@Select("select * from tb_mark")
	List<Mark> findAll();
	
	@Select("select * from tb_order where order_id=#{order_id}")
	Order findByOId(@Param("order_id")int order_id);

}
