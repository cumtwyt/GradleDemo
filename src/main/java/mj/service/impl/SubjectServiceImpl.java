package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Subject;
import mj.mapper.SubjectMapper;
import mj.service.SubjectService;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService{
	
	
	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public List<Subject> getAll() {
		// TODO Auto-generated method stub
		return subjectMapper.findAll();
	}

	@Override
	public Subject addsubject(int id, String name, String detail) {
		// TODO Auto-generated method stub
		return subjectMapper.addsubject(id, name, detail);
	}

	@Override
	public Subject updatesubject(int id, String name, String detail) {
		// TODO Auto-generated method stub
		return subjectMapper.updatesubject(id, name, detail);
	}

	@Override
	public void deletesubject(String name) {
		// TODO Auto-generated method stub
		subjectMapper.deletesubject(name);
		
	}

	
	

	

	
	
	

}
