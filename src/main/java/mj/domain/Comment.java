package mj.domain;

import java.io.Serializable;
import java.util.List;



public class Comment implements Serializable{
	public int com_id;
	public String com_con;
	public String good_id;
	public String user_id;
	public String com_image;
	
	public List<Comment> comments;
	
	
	public Comment(){
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCom_id() {
		return com_id;
	}

	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}

	public String getCom_con() {
		return com_con;
	}

	public void setCom_con(String com_con) {
		this.com_con = com_con;
	}
	
	

	public String getGood_id() {
		return good_id;
	}

	public void setGood_id(String good_id) {
		this.good_id = good_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
	public String getCom_image() {
		return com_image;
	}

	public void setCom_image(String com_image) {
		this.com_image = com_image;
	}

	@Override
	public String toString(){
		return "Comment[com_id="+com_id+",com_con="+com_con+",user_id="+user_id+",good_id="+good_id+",com_image="+com_image+"]";
	}

}
