package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Comment;


public interface CommentMapper {
	
	@Select("select * from tb_comment")
	List<Comment> findAll();
	
	@Select("insert into tb_comment(user_id,good_id,com_con,com_image) values(#{user_id},#{good_id},#{com_con},#{com_image})")
	void addcomment(@Param("user_id")String user_id,@Param("good_id") String good_id,@Param("com_con")String com_con,@Param("com_image") String com_image);
	
	@Delete("delete from tb_comment where user_id=#{id}")
	void deletecomment(String id);
	
	@Select("select * from tb_comment where good_id=#{gid}")
	List<Comment> findComByGId(@Param("gid") String gid);
}
