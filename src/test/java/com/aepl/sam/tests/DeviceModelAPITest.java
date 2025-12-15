package com.aepl.sam.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aepl.sam.models.request.DeviceModelRequest;
import com.aepl.sam.models.response.SaveDeviceModelResponse;
import com.aepl.sam.services.DeviceModelsService;

import io.restassured.response.Response;

public class DeviceModelAPITest {

	private DeviceModelsService deviceModelsService;
	private DeviceModelRequest deviceModelRequest;

	@BeforeClass
	public void setup() {
		deviceModelsService = new DeviceModelsService(LoginAPITest.jwtToken);

		deviceModelRequest = new DeviceModelRequest.Builder().hardwareVersion("v1.0").modelCode("M123").modelId("101")
				.modelName("Test Device").modelSerialSequence("SEQ-001").userId("1").build();
	}

	@Test(priority = 1)
	public void testSaveModelData() {
		DeviceModelRequest request = new DeviceModelRequest.Builder().modelId("") // empty on save
				.modelCode("afsdfa").modelName("afdsasd").modelSerialSequence("afdsa").hardwareVersion("sdfasd")
				.userId("9").createdAt(System.currentTimeMillis()) // timestamp in millis
				.build();

		Response saveResponse = deviceModelsService.saveDeviceModel(request, LoginAPITest.jwtToken);
		SaveDeviceModelResponse response = saveResponse.as(SaveDeviceModelResponse.class);

		Assert.assertTrue(response.isSuccess(), "Save should be successful");
		Assert.assertEquals(response.getStatus(), "CREATED");
		Assert.assertNotNull(response.getData(), "Response data should not be null");
		Assert.assertEquals(response.getData().getModelCode(), "afsdfa");
		Assert.assertEquals(response.getData().getModelName(), "afdsasd");

		System.out.println("✅ Model saved: " + response.getData().getId());
	}

}
