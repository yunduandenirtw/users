package com.smc.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users extends AuditEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  
  @Column(name = "userName")
  private String  userName;
  
  @Column(name = "password")
  private String  password;
  
  @Column(name = "userType")
  private String  userType;
  
  @Column(name = "email")
  private String  email;
  
  @Column(name = "mobileNumber")
  private Integer mobileNumber;

  @Column(name = "confirmed")
  private Integer confirmed;
  
  public Users() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}