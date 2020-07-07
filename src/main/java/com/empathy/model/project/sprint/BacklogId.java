package com.empathy.model.project.sprint;

import java.io.Serializable;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BacklogId implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Column(name = "SPRINT_ID")	
	@JsonProperty("sprintID")	
	private String sprintID;
	
	
	@Column(name = "PROJECT_ID")
	@JsonProperty("projectID")
	private String projectID;
	
	
	
	@Column(name = "ISSUE_ID")	
	@JsonProperty("issueID")	
	private String issueID;

	public BacklogId() {

	}

	public BacklogId(String sprintID, String projectID, String issueID) {
		this.sprintID = sprintID;
		this.projectID = projectID;
		this.issueID = issueID;
	}

	/**
	 * @return the sprintID
	 */
	@JsonProperty("sprintID")	
	public String getSprintID() {
		return sprintID;
	}

	/**
	 * @param sprintID the sprintID to set
	 */
	@JsonProperty("sprintID")	
	public void setSprintID(String sprintID) {
		this.sprintID = sprintID;
	}

	/**
	 * @return the projectID
	 */
	@JsonProperty("projectID")
	public String getProjectID() {
		return projectID;
	}

	/**
	 * @param projectID the projectID to set
	 */
	@JsonProperty("projectID")
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	
	
	/**
	 * @return the issueID
	 */
	@JsonProperty("issueID")
	public String getIssueID() {
		return issueID;
	}

	/**
	 * @param issueID the issueID to set
	 */
	@JsonProperty("issueID")
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sprintID == null) ? 0 : sprintID.hashCode());
		result = prime * result + ((projectID == null) ? 0 : projectID.hashCode());
		result = prime * result + ((issueID == null) ? 0 : issueID.hashCode());

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
		BacklogId other = (BacklogId) obj;

		if (projectID == null) {
			if (other.projectID != null)
				return false;
		} else if (!projectID.equals(other.projectID))
			return false;

		if (sprintID == null) {
			if (other.sprintID != null)
				return false;
		} else if (!sprintID.equals(other.sprintID))
			return false;
				
		if (issueID == null) {
			if (other.issueID != null)
				return false;
		} else if (!issueID.equals(other.issueID))
			return false;
		
		return true;
	}
}
