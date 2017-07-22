package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Good;

public interface GoodMapper {

	@Select("select * from tb_good")
	List<Good> findAll();
	
	@Select("insert into tb_good values(#{id},#{name},#{price},#{remark},#{image},#{subjectid})")
	Good addgood(@Param("id")String id,@Param("name")String name,
			@Param("price") String price,@Param("remark") String remark,@Param("image") String image,@Param("subjectid") int subjectid);
	
	@Select("update tb_good set good_id=#{id},good_name=#{name},"
			+ "good_price=#{price},good_remark=#{remark},good_image=#{image},subject_id=#{subjectid} where good_id=#{id}")
	Good updategood(@Param("id")String id,@Param("name")String name,
			@Param("price")String price,@Param("remark")String remark,@Param("image")String image,@Param("subjectid") int subjectid);
	
	@Delete("delete from tb_good where good_id=#{id}")
	void deletegood(String id);
	
	@Select("select * from tb_good where subject_id=#{sid}")
	List<Good> selectSubjectBySId(@Param("sid")int sid);
	
	@Select("select * from tb_good where good_id=#{id}")
	Good selectById(@Param("id") String id);

}
