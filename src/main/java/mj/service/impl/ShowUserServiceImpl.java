package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.User;
import mj.mapper.ShowUserMapper;
import mj.service.ShowUserService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("showuserService")
public class ShowUserServiceImpl implements ShowUserService{
	@Autowired
	private ShowUserMapper showuserMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<User> getAll() {
		return showuserMapper.findAll();
	}

}
