package com.empathy.model.project.sprint;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.empathy.types.IssueType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "V_PROJECT_TEAM_MEMBER_SPRINT_BACKLOG")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "parentID", "sprintID", "issueLevel", "memberID", "issueID", "projectID", "typeID", "name",
		"description", "effort", "ownerID", "estimatedDate", "createdDate" })
public class TeamMemberSprintIssue {

	@Id
	@Column(name = "ISSUE_ID")
	@JsonProperty("issueID")
	private String issueID;

	@Column(name = "PARENT_ID")
	@JsonProperty("parentID")
	private String parentID;

	@Column(name = "SPRINT_ID")
	@JsonProperty("sprintID")
	private String sprintID;
	
	@Column(name = "ISSUE_LEVEL")
	@JsonProperty("issueLevel")
	private Integer issueLevel;

	@Column(name = "MEMBER_ID")
	@JsonProperty("memberID")
	private String memberID;

	@Column(name = "PROJECT_ID")
	@JsonProperty("projectID")
	private String projectID;

	@Column(name = "TYPE_ID")
	@NotNull
	@JsonProperty("typeID")
	private IssueType typeID;

	@Column(name = "NAME")
	@JsonProperty("name")
	private String name;

	@Column(name = "DESCRIPTION")
	@JsonProperty("description")
	private String description;

	@Column(name = "EFFORT")
	@JsonProperty("effort")
	private Integer effort;

	@Column(name = "OWNER_ID")
	@JsonProperty("ownerID")
	private String ownerID;

	@Column(name = "ESTIMATEDDATE")
	@JsonProperty("estimatedDate")
	private Date estimatedDate;

	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	private Date createdDate;

	@Transient
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

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
	 * @return the parentID
	 */
	public String getParentID() {
		return parentID;
	}

	/**
	 * @param parentID the parentID to set
	 */
	public void setParentID(String parentID) {
		this.parentID = parentID;
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
	 * @return the issueLevel
	 */
	public Integer getIssueLevel() {
		return issueLevel;
	}

	/**
	 * @param issueLevel the issueLevel to set
	 */
	public void setIssueLevel(Integer issueLevel) {
		this.issueLevel = issueLevel;
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
	 * @return the typeID
	 */
	public IssueType getTypeID() {
		return typeID;
	}

	/**
	 * @param typeID the typeID to set
	 */
	public void setTypeID(IssueType typeID) {
		this.typeID = typeID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the effort
	 */
	public Integer getEffort() {
		return effort;
	}

	/**
	 * @param effort the effort to set
	 */
	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	/**
	 * @return the ownerID
	 */
	public String getOwnerID() {
		return ownerID;
	}

	/**
	 * @param ownerID the ownerID to set
	 */
	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	/**
	 * @return the estimatedDate
	 */
	public Date getEstimatedDate() {
		return estimatedDate;
	}

	/**
	 * @param estimatedDate the estimatedDate to set
	 */
	public void setEstimatedDate(Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the metaData
	 */
	public Map<String, Object> getMetaData() {
		return metaData;
	}

	/**
	 * @param metaData the metaData to set
	 */
	public void setMetaData(Map<String, Object> metaData) {
		this.metaData = metaData;
	}

	
}
