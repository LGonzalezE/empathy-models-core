package com.empathy.model.project.sprint;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueMemberDailyId implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name = "SPRINT_ID")
	@JsonProperty("sprintID")
	private String sprintID;

	@NotNull
	@Column(name = "PROJECT_ID")
	@JsonProperty("projectID")
	private String projectID;

	@NotNull
	@Column(name = "ISSUE_ID")
	@JsonProperty("issueID")
	private String issueID;

	@NotNull
	@Column(name = "MEMBER_ID")
	@JsonProperty("memberID")
	private String memberID;
	
	@NotNull
	@Column(name = "DAILY_DATE")
	@JsonProperty("dailyDate")
	private Date dailyDate;

	public IssueMemberDailyId() {

	}

	public IssueMemberDailyId(String sprintID, String projectID, String issueID, String memberID) {
		this.sprintID = sprintID;
		this.projectID = projectID;
		this.issueID = issueID;
		this.memberID = memberID;
	}

	/**
	 * @return the sprintID
	 */
	public String getSprintID() {
		return sprintID;
	}

	/**
	 * @param sprintID the sprintID to set
	 */
	public void setSprintID(String sprintID) {
		this.sprintID = sprintID;
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
	 * @return the issueID
	 */
	public String getIssueID() {
		return issueID;
	}

	/**
	 * @param issueID the issueID to set
	 */
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	/**
	 * @return the memberID
	 */
	public String getMemberID() {
		return memberID;
	}

	/**
	 * @param memberID the memberID to set
	 */
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	
	public Date getDailyDate() {
		return dailyDate;
	}
	
	public void setDailyDate(Date dailyDate) {
		this.dailyDate = dailyDate;
	}

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sprintID == null) ? 0 : sprintID.hashCode());
		result = prime * result + ((projectID == null) ? 0 : projectID.hashCode());
		result = prime * result + ((issueID == null) ? 0 : issueID.hashCode());
		result = prime * result + ((memberID == null) ? 0 : memberID.hashCode());
		result = prime * result + ((dailyDate == null) ? 0 : dailyDate.hashCode());

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
		IssueMemberDailyId other = (IssueMemberDailyId) obj;

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

		if (memberID == null) {
			if (other.memberID != null)
				return false;
		} else if (!memberID.equals(other.memberID))
			return false;
		
		if (dailyDate == null) {
			if (other.dailyDate != null)
				return false;
		} else if (!dailyDate.equals(other.dailyDate))
			return false;

		return true;
	}
}
