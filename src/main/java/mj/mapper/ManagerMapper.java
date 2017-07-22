package mj.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Manager;



public interface ManagerMapper {
	@Select("select * from tb_manager where manager_name= #{managername} and manager_pwd = #{managerpwd}")
	Manager findWithManagernameAndManagerPwd(@Param("managername")String managername,
			@Param("managerpwd") String managerpwd);
}
