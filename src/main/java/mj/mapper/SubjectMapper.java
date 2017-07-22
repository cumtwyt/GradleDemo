package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Subject;

public interface SubjectMapper {
	@Select("select * from tb_subject")
	List<Subject> findAll();
	
	@Select("insert into tb_subject values(#{id},#{name},#{detail})")
	Subject addsubject(@Param("id") int id,@Param("name")String name,@Param("detail") String detail);
	
	@Select("update tb_subject set subject_id=#{id},subject_name=#{name},"
			+ "subject_detail=#{detail} where subject_id=#{id}")
	Subject updatesubject(@Param("id") int id,@Param("name")String name,@Param("detail") String detail);
	
	@Delete("delete from tb_subject where subject_name=#{name}")
	void deletesubject(String name);
	
	

}
