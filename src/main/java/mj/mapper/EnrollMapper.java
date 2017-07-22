package mj.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.User;

public interface EnrollMapper {
	
	@Select("insert into tb_user values(#{id},#{name},#{pwd},#{sex},#{age},#{tel},#{que},#{anw})")
	User insertuser(@Param("id")String id,@Param("name")String name,
			@Param("pwd") String pwd,@Param("sex") String sex,
			@Param("age") String age,@Param("tel") String tel,@Param("que") String que,@Param("anw") String anw);
}
