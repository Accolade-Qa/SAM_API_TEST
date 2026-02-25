package com.aepl.sam.models.request;

public class DeviceModelRequest {
	private String modelId;
	private String modelCode;
	private String modelName;
	private String modelSerialSequence;
	private String hardwareVersion;
	private String userId;
	private long createdAt; 

	public DeviceModelRequest() {
	}

	public DeviceModelRequest(String modelId, String modelCode, String modelName, String modelSerialSequence,
			String hardwareVersion, String userId, long createdAt) {
		this.modelId = modelId;
		this.modelCode = modelCode;
		this.modelName = modelName;
		this.modelSerialSequence = modelSerialSequence;
		this.hardwareVersion = hardwareVersion;
		this.userId = userId;
		this.createdAt = createdAt;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public static class Builder {

		private String modelId;
		private String modelCode;
		private String modelName;
		private String modelSerialSequence;
		private String hardwareVersion;
		private String userId;
		private long createdAt;

		public Builder modelId(String modelId) {
			this.modelId = modelId;
			return this;
		}

		public Builder modelCode(String modelCode) {
			this.modelCode = modelCode;
			return this;
		}

		public Builder modelName(String modelName) {
			this.modelName = modelName;
			return this;
		}

		public Builder modelSerialSequence(String modelSerialSequence) {
			this.modelSerialSequence = modelSerialSequence;
			return this;
		}

		public Builder hardwareVersion(String hardwareVersion) {
			this.hardwareVersion = hardwareVersion;
			return this;
		}

		public Builder userId(String userId) {
			this.userId = userId;
			return this;
		}

		public Builder createdAt(long createdAt) {
			this.createdAt = createdAt;
			return this;
		}

		public DeviceModelRequest build() {
			return new DeviceModelRequest(modelId, modelCode, modelName, modelSerialSequence, hardwareVersion, userId,
					createdAt);
		}
	}
}
