package com.aepl.sam.services;

import com.aepl.sam.base.BaseService;
import com.aepl.sam.models.request.LoginRequest;
import com.aepl.sam.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginService extends BaseService {
	private static final String BASE_PATH = "/users";
	private static final String LOGIN_ENDPOINT = "/login";

	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + LOGIN_ENDPOINT);
	}

	public String getToken(LoginRequest loginRequest) {
		Response response = postRequest(loginRequest, LOGIN_ENDPOINT);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		return loginResponse.getData().getToken(); 
	}
}
