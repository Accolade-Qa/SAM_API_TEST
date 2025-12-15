package com.aepl.sam.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveDeviceModelResponse {
	private String message;
	private boolean success;
	private String status;
	private Data data;

	// Getters & setters

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {
		private int id;
		private String modelCode;
		private String modelName;
		private String modelSerialSequence;
		private String hardwareVersion;
		private int createdBy;
		private String createdAt;
		private Integer updatedBy;
		private String updatedAt;
		private Object createdByUserDetails;
		private Object updatedByUserDetails;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getModelCode() {
			return modelCode;
		}

		public void setModelCode(String modelCode) {
			this.modelCode = modelCode;
		}

		public String getModelName() {
			return modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getModelSerialSequence() {
			return modelSerialSequence;
		}

		public void setModelSerialSequence(String modelSerialSequence) {
			this.modelSerialSequence = modelSerialSequence;
		}

		public String getHardwareVersion() {
			return hardwareVersion;
		}

		public void setHardwareVersion(String hardwareVersion) {
			this.hardwareVersion = hardwareVersion;
		}

		public int getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(int createdBy) {
			this.createdBy = createdBy;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public Integer getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(Integer updatedBy) {
			this.updatedBy = updatedBy;
		}

		public String getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public Object getCreatedByUserDetails() {
			return createdByUserDetails;
		}

		public void setCreatedByUserDetails(Object createdByUserDetails) {
			this.createdByUserDetails = createdByUserDetails;
		}

		public Object getUpdatedByUserDetails() {
			return updatedByUserDetails;
		}

		public void setUpdatedByUserDetails(Object updatedByUserDetails) {
			this.updatedByUserDetails = updatedByUserDetails;
		}
	}
}
