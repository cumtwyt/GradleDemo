package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import mj.domain.User;



public interface ShowUserMapper {
	@Select("select * from tb_user")
	List<User> findAll();

}
