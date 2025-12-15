package com.aepl.sam.models.response;

import java.util.ArrayList;

public class DeviceModelResponse {
	private int modelId;
	private String modelCode;
	private String modelName;
	private String modelSerialSequence;
	private String hardwareVersion;
	private int userId;
	private int updatedBy;
	private String createdAt;
	private String updatedAt;

	// Getters and Setters
	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	// toString for debugging
	@Override
	public String toString() {
		return "DeviceModelResponse{" + "modelId=" + modelId + ", modelCode='" + modelCode + '\'' + ", modelName='"
				+ modelName + '\'' + ", modelSerialSequence='" + modelSerialSequence + '\'' + ", hardwareVersion='"
				+ hardwareVersion + '\'' + ", userId=" + userId + ", updatedBy=" + updatedBy + ", createdAt='"
				+ createdAt + '\'' + ", updatedAt='" + updatedAt + '\'' + '}';
	}

	// Builder pattern
	public static class Builder {
		private final DeviceModelResponse response;

		public Builder() {
			this.response = new DeviceModelResponse();
		}

		public Builder modelId(int modelId) {
			response.setModelId(modelId);
			return this;
		}

		public Builder modelCode(String modelCode) {
			response.setModelCode(modelCode);
			return this;
		}

		public Builder modelName(String modelName) {
			response.setModelName(modelName);
			return this;
		}

		public Builder modelSerialSequence(String modelSerialSequence) {
			response.setModelSerialSequence(modelSerialSequence);
			return this;
		}

		public Builder hardwareVersion(String hardwareVersion) {
			response.setHardwareVersion(hardwareVersion);
			return this;
		}

		public Builder userId(int userId) {
			response.setUserId(userId);
			return this;
		}

		public Builder updatedBy(int updatedBy) {
			response.setUpdatedBy(updatedBy);
			return this;
		}

		public Builder createdAt(String createdAt) {
			response.setCreatedAt(createdAt);
			return this;
		}

		public Builder updatedAt(String updatedAt) {
			response.setUpdatedAt(updatedAt);
			return this;
		}

		public DeviceModelResponse build() {
			return response;
		}
	}

	// Nested Root class
	public static class Root {
		private int totalItems;
		private int pageNumber;
		private int totalPages;
		private int pageSize;
		private String message;
		private boolean status;
		private ArrayList<DeviceModelResponse> data;

		// Getters and Setters
		public int getTotalItems() {
			return totalItems;
		}

		public void setTotalItems(int totalItems) {
			this.totalItems = totalItems;
		}

		public int getPageNumber() {
			return pageNumber;
		}

		public void setPageNumber(int pageNumber) {
			this.pageNumber = pageNumber;
		}

		public int getTotalPages() {
			return totalPages;
		}

		public void setTotalPages(int totalPages) {
			this.totalPages = totalPages;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}

		public ArrayList<DeviceModelResponse> getData() {
			return data;
		}

		public void setData(ArrayList<DeviceModelResponse> data) {
			this.data = data;
		}

		// Builder pattern
		public static class Builder {
			private final Root root;

			public Builder() {
				this.root = new Root();
			}

			public Builder totalItems(int totalItems) {
				root.setTotalItems(totalItems);
				return this;
			}

			public Builder pageNumber(int pageNumber) {
				root.setPageNumber(pageNumber);
				return this;
			}

			public Builder totalPages(int totalPages) {
				root.setTotalPages(totalPages);
				return this;
			}

			public Builder pageSize(int pageSize) {
				root.setPageSize(pageSize);
				return this;
			}

			public Builder message(String message) {
				root.setMessage(message);
				return this;
			}

			public Builder status(boolean status) {
				root.setStatus(status);
				return this;
			}

			public Builder data(ArrayList<DeviceModelResponse> data) {
				root.setData(data);
				return this;
			}

			public Root build() {
				return root;
			}
		}
	}
}
