package com.form.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginDetail {
	
	@NotBlank(message = "User Name can't be empty")
	@Size(min = 3, max = 12, message = "User Name must be between 3-12 characters")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email!")
	private String userEmail;
	
	@AssertTrue(message = "Terms and Condition must be checked")
	private boolean agreed;
		
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "LoginDetail [userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
}
