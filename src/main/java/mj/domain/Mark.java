package mj.domain;

import java.io.Serializable;

public class Mark implements Serializable{
	
	public int mark_id;
	public String user_id;
	public int order_id;
	public String mark_wl;
	public String mark_zl;
	public String mark_fw;
	
	public Mark(){
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMark_id() {
		return mark_id;
	}

	public void setMark_id(int mark_id) {
		this.mark_id = mark_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getMark_wl() {
		return mark_wl;
	}

	public void setMark_wl(String mark_wl) {
		this.mark_wl = mark_wl;
	}

	public String getMark_zl() {
		return mark_zl;
	}

	public void setMark_zl(String mark_zl) {
		this.mark_zl = mark_zl;
	}

	public String getMark_fw() {
		return mark_fw;
	}

	public void setMark_fw(String mark_fw) {
		this.mark_fw = mark_fw;
	}
	
	@Override
	public String toString(){
		return "Mark[mark_id="+mark_id+",user_id="+user_id+",order_id="+order_id+""
				+ ",mark_wl="+mark_wl+",mark_zl="+mark_zl+",mark_fw="+mark_fw+"]";
	}

}
