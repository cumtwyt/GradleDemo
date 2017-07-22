package mj.domain;

import java.io.Serializable;

public class User implements Serializable{

	public String User_id;
	public String User_name;
	public String User_pwd;
	public String User_sex;
	public String User_age;
	public String User_tel;
	public String User_que;
	public String User_anw;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		public String getUser_id() {
	        return User_id;
	    }
	    public void setUser_id(String user_id) {
	        this.User_id = user_id;
	    }
	    public String getUser_name() {
	        return User_name;
	    }
	    public void setUser_name(String user_name) {
	        this.User_name = user_name;
	    }
		public String getUser_pwd() {
			return User_pwd;
		}
		public void setUser_pwd(String user_pwd) {
			User_pwd = user_pwd;
		}
		public String getUser_sex() {
			return User_sex;
		}
		public void setUser_sex(String user_sex) {
			User_sex = user_sex;
		}
		public String getUser_age() {
			return User_age;
		}
		public void setUser_age(String user_age) {
			User_age = user_age;
		}
		public String getUser_tel() {
			return User_tel;
		}
		public void setUser_tel(String user_tel) {
			User_tel = user_tel;
		}
		public String getUser_que() {
			return User_que;
		}
		public void setUser_que(String user_que) {
			User_que = user_que;
		}
		public String getUser_anw() {
			return User_anw;
		}
		public void setUser_anw(String user_anw) {
			User_anw = user_anw;
		}
		
		@Override
		public String toString() {
			return "User [User_id=" + User_id + ", User_name=" + User_name + ", User_pwd="
					+ User_pwd + ",User_sex="+User_sex+",User_age="+User_age+","
							+ "User_tel="+User_tel+",User_que="+User_que+",User_anw="+User_anw+"]";
		}
	
	
}
