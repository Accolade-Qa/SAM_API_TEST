package com.aepl.sam.models.request;

public class LoginRequest {
	private String userEmail;
	private String password;

	public LoginRequest(String userEmail, String password) {
		super();
		this.userEmail = userEmail;
		this.password = password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginRequest [userEmail=" + userEmail + ", password=" + password + "]";
	}

}
