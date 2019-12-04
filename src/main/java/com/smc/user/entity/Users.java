package com.smc.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userid;
  
  @Column(name = "username")
  private String  username;
  
  @Column(name = "password")
  private String  password;
  
  @Column(name = "usertype")
  private String  usertype;
  
  @Column(name = "email")
  private String  email;
  
  @Column(name = "mobile")
  private Integer mobile;

  @Column(name = "confirmed")
  private Integer confirmed;
  
  public Users() {
    super();
    // TODO Auto-generated constructor stub
  }
  
    public Integer getUserid() {
	    return userid;
    }

    public void setUserid(Integer userid) {
	    this.userid = userid;
    }


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public Integer getConfirmed() {
    	return confirmed;
	}

	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}
}