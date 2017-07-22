package mj.domain;

import java.io.Serializable;

public class Good implements Serializable{

	public String good_id ;
	public String good_name;
	public String good_price;
	public String good_remark;
	public String good_image;
	public String good_image1;
	public String good_image2;
	public Subject Subject_id;
	public int good_store;
	public int good_sell;
	
	

	

	public String getGood_id() {
		return good_id;
	}

	public void setGood_id(String good_id) {
		this.good_id = good_id;
	}

	public String getGood_name() {
		return good_name;
	}

	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}

	public String getGood_price() {
		return good_price;
	}

	public void setGood_price(String good_price) {
		this.good_price = good_price;
	}

	public String getGood_remark() {
		return good_remark;
	}

	public void setGood_remark(String good_remark) {
		this.good_remark = good_remark;
	}

	public String getGood_image() {
		return good_image;
	}

	public void setGood_image(String good_image) {
		this.good_image = good_image;
	}

	public Subject getSubject_id() {
		return Subject_id;
	}

	public void setSubject_id(Subject subject_id) {
		Subject_id = subject_id;
	}

	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
		
	public String getGood_image1() {
		return good_image1;
	}

	public void setGood_image1(String good_image1) {
		this.good_image1 = good_image1;
	}

	public String getGood_image2() {
		return good_image2;
	}

	public void setGood_image2(String good_image2) {
		this.good_image2 = good_image2;
	}
	
	

	public int getGood_store() {
		return good_store;
	}

	public void setGood_store(int good_store) {
		this.good_store = good_store;
	}

	public int getGood_sell() {
		return good_sell;
	}

	public void setGood_sell(int good_sell) {
		this.good_sell = good_sell;
	}

	@Override
	public String toString() {
		return "Good [good_id=" + good_id +",good_name="+good_name + ", good_price="
				+ good_price + ",good_remark="+good_remark+",good_image="+good_image+",good_image1="+good_image1+","
						+ "good_image2="+good_image2+",good_store="+good_store+",good_sell="+good_sell+"]";
	}
	
	
}
