package com.aepl.sam.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aepl.sam.models.request.LoginRequest;
import com.aepl.sam.models.response.LoginResponse;
import com.aepl.sam.services.LoginService;

import io.restassured.response.Response;

public class LoginAPITest {
	private LoginService loginService;
	private LoginRequest loginRequest;
	public static String jwtToken;

	@BeforeClass
	public void setup() {
		loginService = new LoginService();
		loginRequest = new LoginRequest("suraj.bhalerao@accoladeelectronics.com", "oM0mvdKA");
	}

	@Test(priority = 1)
	public void loginTest() {
		Response response = loginService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);

		Assert.assertEquals(loginResponse.getMessage(), "Success", "Message should be Success");
		Assert.assertTrue(loginResponse.isStatus(), "Status should be true");

		LoginResponse.DataInfo data = loginResponse.getData();
		Assert.assertEquals(data.getId(), 9);
		Assert.assertEquals(data.getEmail(), "suraj.bhalerao@accoladeelectronics.com");
		Assert.assertEquals(data.getFullName(), "Suraj Bhalerao");
		Assert.assertEquals(data.getLeadName(), "Super Admin");
		Assert.assertEquals(data.getRoleType(), "Super Administrator");
		Assert.assertEquals(data.getHierarchy(), 0);
		Assert.assertEquals(data.getUserRole(), "Super Admin");
		Assert.assertNotNull(data.getToken(), "Token should not be null");
	}

	@Test(priority = 2)
	public void validateUserPermissions() {
		Response response = loginService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);

		List<LoginResponse.UserPermission> permissions = loginResponse.getData().getUserPermission();

		Assert.assertEquals(permissions.size(), 18, "There should be 18 permissions");

		Assert.assertEquals(permissions.get(0).getPageName(), "Dashboard");
		Assert.assertTrue(permissions.get(0).isView(), "Dashboard should have view access");

		for (LoginResponse.UserPermission perm : permissions) {
			Assert.assertNotNull(perm.getPageName(), "PageName should not be null");
			Assert.assertTrue(perm.isView(), perm.getPageName() + " should have view access");
		}

		boolean found = permissions.stream().anyMatch(p -> p.getPageName().equals("User Management"));
		Assert.assertTrue(found, "User Management page should exist in permissions");
	}

	@Test(priority = 3)
	public void validateToken() {
		Response response = loginService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);

		String token = loginResponse.getData().getToken();
		Assert.assertNotNull(token, "Token should not be null");
		Assert.assertTrue(token.split("\\.").length == 3, "Token should be a valid JWT");

		jwtToken = token;
		System.out.println("Stored JWT Token: " + jwtToken);
	}

}
