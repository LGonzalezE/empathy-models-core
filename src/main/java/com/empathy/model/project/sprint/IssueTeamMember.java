package com.empathy.model.project.sprint;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "V_PROJECT_ISSUE_TEAM_MEMBER")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "parentIssueID", "userID", "name"})
public class IssueTeamMember {

		
	@Column(name = "PARENT_ISSUE_ID")
	@JsonProperty("parentIssueID")
	private String parentIssueID;
	
	@Id
	@Column(name = "USER_ID")
	@JsonProperty("userID")
	private String userID;
	
	@Column(name = "NAME")
	@JsonProperty("name")
	private String name;

	/**
	 * @return the parentIssueID
	 */
	@JsonProperty("parentIssueID")
	public String getParentIssueID() {
		return parentIssueID;
	}

	/**
	 * @param parentIssueID the parentIssueID to set
	 */
	@JsonProperty("parentIssueID")
	public void setParentIssueID(String parentIssueID) {
		this.parentIssueID = parentIssueID;
	}

	/**
	 * @return the userID
	 */
	@JsonProperty("userID")
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	@JsonProperty("userID")
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	
	
	

}
