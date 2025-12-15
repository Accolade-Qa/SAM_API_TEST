package com.aepl.sam.models.response;

import java.util.List;

public class LoginResponse {
	private String message;
	private boolean status;
	private DataInfo data;

	// Constructors
	public LoginResponse() {
	}

	public LoginResponse(String message, boolean status, DataInfo data) {
		this.message = message;
		this.status = status;
		this.data = data;
	}

	// Getters and Setters
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

	public DataInfo getData() {
		return data;
	}

	public void setData(DataInfo data) {
		this.data = data;
	}

	// Builder
	public static class Builder {
		private String message;
		private boolean status;
		private DataInfo data;

		public Builder message(String message) {
			this.message = message;
			return this;
		}

		public Builder status(boolean status) {
			this.status = status;
			return this;
		}

		public Builder data(DataInfo data) {
			this.data = data;
			return this;
		}

		public LoginResponse build() {
			return new LoginResponse(message, status, data);
		}
	}

	// toString
	@Override
	public String toString() {
		return "LoginResponse{" + "message='" + message + '\'' + ", status=" + status + ", data=" + data + '}';
	}

	// Nested DataInfo class
	public static class DataInfo {
		private int id;
		private String email;
		private String fullName;
		private List<UserPermission> userPermission;
		private Object leadId;
		private String leadName;
		private String roleType;
		private int hierarchy;
		private String userRole;
		private String token;

		// Constructors
		public DataInfo() {
		}

		public DataInfo(int id, String email, String fullName, List<UserPermission> userPermission, Object leadId,
				String leadName, String roleType, int hierarchy, String userRole, String token) {
			this.id = id;
			this.email = email;
			this.fullName = fullName;
			this.userPermission = userPermission;
			this.leadId = leadId;
			this.leadName = leadName;
			this.roleType = roleType;
			this.hierarchy = hierarchy;
			this.userRole = userRole;
			this.token = token;
		}

		// Getters and Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public List<UserPermission> getUserPermission() {
			return userPermission;
		}

		public void setUserPermission(List<UserPermission> userPermission) {
			this.userPermission = userPermission;
		}

		public Object getLeadId() {
			return leadId;
		}

		public void setLeadId(Object leadId) {
			this.leadId = leadId;
		}

		public String getLeadName() {
			return leadName;
		}

		public void setLeadName(String leadName) {
			this.leadName = leadName;
		}

		public String getRoleType() {
			return roleType;
		}

		public void setRoleType(String roleType) {
			this.roleType = roleType;
		}

		public int getHierarchy() {
			return hierarchy;
		}

		public void setHierarchy(int hierarchy) {
			this.hierarchy = hierarchy;
		}

		public String getUserRole() {
			return userRole;
		}

		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		// Builder
		public static class Builder {
			private int id;
			private String email;
			private String fullName;
			private List<UserPermission> userPermission;
			private Object leadId;
			private String leadName;
			private String roleType;
			private int hierarchy;
			private String userRole;
			private String token;

			public Builder id(int id) {
				this.id = id;
				return this;
			}

			public Builder email(String email) {
				this.email = email;
				return this;
			}

			public Builder fullName(String fullName) {
				this.fullName = fullName;
				return this;
			}

			public Builder userPermission(List<UserPermission> userPermission) {
				this.userPermission = userPermission;
				return this;
			}

			public Builder leadId(Object leadId) {
				this.leadId = leadId;
				return this;
			}

			public Builder leadName(String leadName) {
				this.leadName = leadName;
				return this;
			}

			public Builder roleType(String roleType) {
				this.roleType = roleType;
				return this;
			}

			public Builder hierarchy(int hierarchy) {
				this.hierarchy = hierarchy;
				return this;
			}

			public Builder userRole(String userRole) {
				this.userRole = userRole;
				return this;
			}

			public Builder token(String token) {
				this.token = token;
				return this;
			}

			public DataInfo build() {
				return new DataInfo(id, email, fullName, userPermission, leadId, leadName, roleType, hierarchy,
						userRole, token);
			}
		}

		// toString
		@Override
		public String toString() {
			return "DataInfo{" + "id=" + id + ", email='" + email + '\'' + ", fullName='" + fullName + '\''
					+ ", userPermission=" + userPermission + ", leadId=" + leadId + ", leadName='" + leadName + '\''
					+ ", roleType='" + roleType + '\'' + ", hierarchy=" + hierarchy + ", userRole='" + userRole + '\''
					+ ", token='" + token + '\'' + '}' + "\n";
		}
	}

	// Nested UserPermission class
	public static class UserPermission {
		private int id;
		private String pageName;
		private boolean view;
		private boolean create;
		private boolean update;
		private boolean delete;
		private int sequenceId;
		private int parentMenuId;

		// Constructors
		public UserPermission() {
		}

		public UserPermission(int id, String pageName, boolean view, boolean create, boolean update, boolean delete,
				int sequenceId, int parentMenuId) {
			this.id = id;
			this.pageName = pageName;
			this.view = view;
			this.create = create;
			this.update = update;
			this.delete = delete;
			this.sequenceId = sequenceId;
			this.parentMenuId = parentMenuId;
		}

		// Getters and Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPageName() {
			return pageName;
		}

		public void setPageName(String pageName) {
			this.pageName = pageName;
		}

		public boolean isView() {
			return view;
		}

		public void setView(boolean view) {
			this.view = view;
		}

		public boolean isCreate() {
			return create;
		}

		public void setCreate(boolean create) {
			this.create = create;
		}

		public boolean isUpdate() {
			return update;
		}

		public void setUpdate(boolean update) {
			this.update = update;
		}

		public boolean isDelete() {
			return delete;
		}

		public void setDelete(boolean delete) {
			this.delete = delete;
		}

		public int getSequenceId() {
			return sequenceId;
		}

		public void setSequenceId(int sequenceId) {
			this.sequenceId = sequenceId;
		}

		public int getParentMenuId() {
			return parentMenuId;
		}

		public void setParentMenuId(int parentMenuId) {
			this.parentMenuId = parentMenuId;
		}

		// Builder
		public static class Builder {
			private int id;
			private String pageName;
			private boolean view;
			private boolean create;
			private boolean update;
			private boolean delete;
			private int sequenceId;
			private int parentMenuId;

			public Builder id(int id) {
				this.id = id;
				return this;
			}

			public Builder pageName(String pageName) {
				this.pageName = pageName;
				return this;
			}

			public Builder view(boolean view) {
				this.view = view;
				return this;
			}

			public Builder create(boolean create) {
				this.create = create;
				return this;
			}

			public Builder update(boolean update) {
				this.update = update;
				return this;
			}

			public Builder delete(boolean delete) {
				this.delete = delete;
				return this;
			}

			public Builder sequenceId(int sequenceId) {
				this.sequenceId = sequenceId;
				return this;
			}

			public Builder parentMenuId(int parentMenuId) {
				this.parentMenuId = parentMenuId;
				return this;
			}

			public UserPermission build() {
				return new UserPermission(id, pageName, view, create, update, delete, sequenceId, parentMenuId);
			}
		}

		// toString
		@Override
		public String toString() {
			return "UserPermission{" + "id=" + id + ", pageName='" + pageName + '\'' + ", view=" + view + ", create="
					+ create + ", update=" + update + ", delete=" + delete + ", sequenceId=" + sequenceId
					+ ", parentMenuId=" + parentMenuId + '}' + "\n";
		}
	}
}
