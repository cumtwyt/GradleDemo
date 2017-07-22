package mj.domain;

import java.io.Serializable;

public class Order implements Serializable{
	
	public Integer Order_id;
	public String Order_uid;
	public String Order_gid;
	public String Order_gname;
	public String Order_price;
	public int Order_number;
	public String Order_image;
	public String Order_status;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOrder_id() {
		return Order_id;
	}

	public void setOrder_id(Integer order_id) {
		Order_id = order_id;
	}

	public String getOrder_uid() {
		return Order_uid;
	}

	public void setOrder_uid(String order_uid) {
		Order_uid = order_uid;
	}

	public String getOrder_gid() {
		return Order_gid;
	}

	public void setOrder_gid(String order_gid) {
		Order_gid = order_gid;
	}

	public String getOrder_gname() {
		return Order_gname;
	}

	public void setOrder_gname(String order_gname) {
		Order_gname = order_gname;
	}

	public String getOrder_price() {
		return Order_price;
	}

	public void setOrder_price(String order_price) {
		Order_price = order_price;
	}

	public int getOrder_number() {
		return Order_number;
	}

	public void setOrder_number(int order_number) {
		Order_number = order_number;
	}

	public String getOrder_image() {
		return Order_image;
	}

	public void setOrder_image(String order_image) {
		Order_image = order_image;
	}

	public String getOrder_status() {
		return Order_status;
	}

	public void setOrder_status(String order_status) {
		Order_status = order_status;
	}
	
	@Override
	public String toString() {
		return "Order[Order_id="+Order_id+",Order_uid="+Order_uid+",Order_gid="+Order_gid+","
				+ " Order_gname="+Order_gname+",Order_price="+Order_price+",Order_number="+Order_number+","
						+ "Order_image="+Order_image+",Order_status="+Order_status+"]";}
}
