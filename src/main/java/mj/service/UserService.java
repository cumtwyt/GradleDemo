package mj.service;

import java.util.List;

import mj.domain.User;

public interface UserService {
	User login(String loginname,String password);
	
	User check(String que,String anw);
	
	User updateuser(String id, String name, String pwd, String sex, String age,
			String tel,String que,String anw);
	
	List<User> readuser(String id);
	
	void deleteuser(String id);
	
	User protect(String username,String question,String answer);
	
	User updatepwd(String password,String user_id);

}
