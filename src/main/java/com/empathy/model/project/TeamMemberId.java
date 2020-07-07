package com.empathy.model.project;

import java.io.Serializable;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamMemberId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "PROJECT_ID")
	@JsonProperty("projectID")
	private String projectID;
	
	@Column(name = "USER_ID")
	@JsonProperty("userID")
	private String userID;

	public TeamMemberId() {

	}

	public TeamMemberId(String projectID, String userID) {
		this.projectID = projectID;
		this.userID = userID;
	}

	/**
	 * @return the projectID
	 */
	public String getProjectID() {
		return projectID;
	}

	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectID == null) ? 0 : projectID.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamMemberId other = (TeamMemberId) obj;

		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;

		if (projectID == null) {
			if (other.projectID != null)
				return false;
		} else if (!projectID.equals(other.projectID))
			return false;
		return true;
	}
}
