package com.aepl.sam.services;

import com.aepl.sam.base.BaseService;
import com.aepl.sam.models.request.DeviceModelRequest;

import io.restassured.response.Response;

public class DeviceModelsService extends BaseService {
	private static final String SAVE_MODEL_ENDPOINT = "/sam/api/deviceModel/saveModel";

	private String token;

	public DeviceModelsService(String token) {
		this.token = token;
	}

	public Response saveDeviceModel(DeviceModelRequest request, String token) {
		return postRequest(request, SAVE_MODEL_ENDPOINT, token);
	}
}
