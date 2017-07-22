package mj.domain;

import java.io.Serializable;

public class Collect implements Serializable{
	
	public String collect_uid;
	public String collect_gid;
	public String collect_gname;
	public String collect_price;
	public String collect_image;
	
	public Collect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCollect_uid() {
		return collect_uid;
	}

	public void setCollect_uid(String collect_uid) {
		this.collect_uid = collect_uid;
	}

	public String getCollect_gid() {
		return collect_gid;
	}

	public void setCollect_gid(String collect_gid) {
		this.collect_gid = collect_gid;
	}

	public String getCollect_gname() {
		return collect_gname;
	}

	public void setCollect_gname(String collect_gname) {
		this.collect_gname = collect_gname;
	}

	public String getCollect_price() {
		return collect_price;
	}

	public void setCollect_price(String collect_price) {
		this.collect_price = collect_price;
	}

	public String getCollect_image() {
		return collect_image;
	}

	public void setCollect_image(String collect_image) {
		this.collect_image = collect_image;
	}
	
	@Override
	public String toString() {
		return "Collect [collect_uid=" + collect_uid + ",collect_gid="+collect_gid+", collect_gname=" + collect_gname + ", collect_price="
				+ collect_price + ",collect_image="+collect_image+"]";
	}
}
