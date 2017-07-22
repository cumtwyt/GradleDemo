package mj.service;

import java.util.List;

import mj.domain.Subject;

public interface SubjectService {
	List<Subject> getAll();
	
	Subject addsubject(int id,String name,String detail);

	Subject updatesubject(int id,String name,String detail);

	void deletesubject(String name);
	
	

}
