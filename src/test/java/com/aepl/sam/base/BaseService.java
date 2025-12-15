package com.aepl.sam.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private static final String BASE_URI = "http://aepltest.accoladeelectronics.com:9090";
	private RequestSpecification req;

	public BaseService() {
		req = RestAssured.given().baseUri(BASE_URI);
	}    

	// --- Without token ---
	protected Response postRequest(Object payload, String endpoint) {
		return req.contentType(ContentType.JSON).body(payload).when().post(endpoint).then().extract().response();
	}

	protected Response getRequest(String endpoint) {
		return req.contentType(ContentType.JSON).when().get(endpoint).then().extract().response();
	}

	// --- With token ---
	protected Response postRequest(Object payload, String endpoint, String token) {
		return req.contentType(ContentType.JSON).header("Authorization", "Bearer " + token).body(payload).when()
				.post(endpoint).then().extract().response();
	}

	protected Response getRequest(String endpoint, String token) {
		return req.contentType(ContentType.JSON).header("Authorization", "Bearer " + token).when().get(endpoint).then()
				.extract().response();
	}
}
