package mj.domain;

import java.io.Serializable;

public class Subject implements Serializable{
	public int Subject_id;
	public String Subject_name;
	public String Subject_detail;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getSubject_id() {
		return Subject_id;
	}
	public void setSubject_id(int subject_id) {
		Subject_id = subject_id;
	}
	public String getSubject_name() {
		return Subject_name;
	}
	public void setSubject_name(String subject_name) {
		Subject_name = subject_name;
	}
	public String getSubject_detail() {
		return Subject_detail;
	}
	public void setSubject_detail(String subject_detail) {
		Subject_detail = subject_detail;
	}
	
	@Override
	public String toString() {
		return "Subject [Subject_id=" +Subject_id + ", Subject_name=" + Subject_name + ", Subject_detail="+ Subject_detail + "]";
	}

}
