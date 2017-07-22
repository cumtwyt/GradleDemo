package mj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mj.domain.Comment;



public interface CommentService {
	List<Comment> getAll();
		
	void addcomment(String user_id,String good_id,String com_con,String com_image);
	
	void deletecomment(String id);
	
	List<Comment> findComByGId(String gid);

}
