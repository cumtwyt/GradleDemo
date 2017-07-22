package mj.service;

import java.util.List;

import mj.domain.Collect;
import mj.domain.Good;

public interface CollectService {
	Good selectGood(String good_id);
	
	Collect findGoodById(String user_id,String good_id);
	
	void insertcollect(String user_id,String good_id,String collect_gname,
			int collect_price,String collect_image);
	
	List<Collect> readcollect(String user_id);

}
