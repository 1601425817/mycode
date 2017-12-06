package entity;

import java.util.List;


public class account {
	
	private Integer aid;
	private String email;
	private String nickName;
	private String password;
	private String pic;
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", email=" + email + ", nickName=" + nickName + ", pic=" + pic+
				 "]";
	}
	
	
	
}
