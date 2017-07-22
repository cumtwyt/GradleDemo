package mj.service;

import mj.domain.User;

public interface EnrollService {
	User enroll(String id,String name,String pwd,String sex,String age,String tel,String que,String anw);
}
