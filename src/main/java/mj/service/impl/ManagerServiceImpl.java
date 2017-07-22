package mj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Manager;
import mj.domain.User;
import mj.mapper.ManagerMapper;
import mj.service.ManagerService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerMapper managerMapper;
	
	@Transactional(readOnly=true)
	@Override
	public Manager mlogin(String managername, String managerpwd) {
		return managerMapper.findWithManagernameAndManagerPwd(managername, managerpwd);
	}

}
