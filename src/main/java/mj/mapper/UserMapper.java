package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where user_name= #{loginname} and user_pwd = #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	
	@Select("select * from tb_user where user_que= #{que} and user_anw = #{anw}")
	User findWithQueAndAnw(@Param("que")String que,
			@Param("anw") String anw);
	
	@Select("update tb_user set user_id=#{id},user_name=#{name},"
			+ "user_pwd=#{pwd},user_sex=#{sex},user_age=#{age},user_tel=#{tel},user_que=#{que},user_anw=#{anw} where user_id=#{id}")
	User updateuser(@Param("id")String id,@Param("name")String name,
			@Param("pwd")String pwd,@Param("sex")String sex,@Param("age")String age,
			@Param("tel")String tel,@Param("que")String que,@Param("anw")String anw);
	
	@Select("select * from tb_user where user_id=#{id}")
	List<User> readuser(@Param("id")String id);
	
	@Delete("delete from tb_user where user_id=#{id}")
	void deleteuser(String id);
	
	@Select("select * from tb_user where user_name=#{username} and user_que=#{question} and user_anw=#{answer}")
	User findQuestionAndAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);
	
	@Select("update tb_user set user_pwd=#{password} where user_id=#{user_id}")
	User updatepwd(@Param("password")String password,@Param("user_id")String user_id);
	
	@Select("select * from tb_user where user_name= #{loginname} and user_email = #{email}")
	User findWithLoginnameAndEmail(@Param("loginname")String loginname,
			@Param("email") String email);
}

