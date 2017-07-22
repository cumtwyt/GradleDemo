package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Collect;
import mj.domain.Good;

public interface CollectMapper {
	
	@Select("select * from tb_good where good_id=#{good_id}")
	Good selectGood(@Param("good_id")String good_id);
	
	@Select("select * from tb_collect where collect_uid=#{user_id} and collect_gid=#{good_id}")
	Collect findGoodById(@Param("user_id")String user_id,@Param("good_id")String good_id);
	
	@Insert("insert into tb_collect values(#{user_id},#{good_id},#{collect_gname},#{collect_price},#{collect_image})")
	void insertcollect(@Param("user_id")String user_id,@Param("good_id")String good_id,
			@Param("collect_gname")String collect_gname,@Param("collect_price")int collect_price,@Param("collect_image")String collect_image);
	
	@Select("select * from tb_collect where collect_uid=#{user_id}")
	List<Collect> readcollect(@Param("user_id")String user_id);
}
