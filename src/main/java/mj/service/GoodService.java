package mj.service;

import java.util.List;

import mj.domain.Good;

public interface GoodService {
	List<Good> getAll();
	
	Good addgood(String id,String name,String price,String remark,String image,String image1,String image2,int subjectid,int store,int sell);

	Good updategood(String id, String name, String price, String remark, String image,int subjectid);

	public void deletegood(String id);
	
	List<Good> selectSubjectBySId(int sid);
	
	Good selectById(String id);

	
}
