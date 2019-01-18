package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Table(name="user")
@Component
public class User {

	@Id
	@GeneratedValue
	private int uid;
	private String uname;
	
/*	@Pattern(regexp="^[a-z0-9@]{2,}")*/
	@NotNull(message="You can not leave it Empty !")
	private String uemail;
	private String upassword;
	
	@NotNull(message="You can not leave it Empty !")
	//@Size(min=10,max=10,message="Enter minimum and maximum 10 Character ...")
	private Integer pincode;
	
	@NotNull(message="You can not leave it Empty")
	@Size(min=10,max=10,message="Enter minimum 10 Character ...")
	private String unumber;

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUnumber() {
		return unumber;
	}
	public void setUnumber(String unumber) {
		this.unumber = unumber;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
}
