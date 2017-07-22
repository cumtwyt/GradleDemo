package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.User;
import mj.mapper.UserMapper;
import mj.service.UserService;
/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String loginname, String password) {
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}

	@Transactional(readOnly=true)
	@Override
	public User check(String que, String anw) {
		// TODO Auto-generated method stub
		return userMapper.findWithQueAndAnw(que, anw);
	}

	@Override
	public User updateuser(String id, String name, String pwd, String sex, String age, String tel, String que,
			String anw) {
		// TODO Auto-generated method stub
		return userMapper.updateuser(id, name, pwd, sex, age, tel, que, anw);
	}

	@Override
	public List<User> readuser(String id) {
		// TODO Auto-generated method stub
		return userMapper.readuser(id);
	}

	@Override
	public void deleteuser(String id) {
		// TODO Auto-generated method stub
		userMapper.deleteuser(id);
	}

	@Override
	public User protect(String username, String question, String answer) {
		// TODO Auto-generated method stub
		return userMapper.findQuestionAndAnswer(username, question, answer);
	}

	@Override
	public User updatepwd(String password, String user_id) {
		// TODO Auto-generated method stub
		return userMapper.updatepwd(password, user_id);
	}

	@Override
	public User findWithLoginnameAndEmail(String loginname, String email) {
		// TODO Auto-generated method stub
		return userMapper.findWithLoginnameAndEmail(loginname, email);
	}

}
