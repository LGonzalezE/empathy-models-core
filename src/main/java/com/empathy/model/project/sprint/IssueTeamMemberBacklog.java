package com.empathy.model.project.sprint;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.empathy.types.IssueType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "V_PROJECT_ISSUE_TEAM_MEMBER_BACKLOG")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "parentID", "issueID", "projectID", "typeID", "name", "description", "effort", "ownerID",
		"estimatedDate", "createdDate" })
public class IssueTeamMemberBacklog {

	@Id
	@Column(name = "ISSUE_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@JsonProperty("issueID")
	private String issueID;

	@Column(name = "PARENT_ID")
	@JsonProperty("parentID")
	private String parentID;

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
	@JsonProperty("metadaData")
	private Map<String, Object> metadaData = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public IssueTeamMemberBacklog() {
	}

	@JsonProperty("issueID")
	public String getIssueID() {
		return issueID;
	}

	@JsonProperty("issueID")
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	@JsonProperty("parentID")
	public String getParentID() {
		return parentID;
	}

	@JsonProperty("parentID")
	public void setParentID(String parentID) {
		this.issueID = parentID;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return projectID;
	}

	@JsonProperty("projectID")
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("typeID")
	public IssueType getTypeID() {
		return typeID;
	}

	@JsonProperty("typeID")
	public void setTypeID(IssueType typeID) {
		this.typeID = typeID;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("effort")
	public Integer getEffort() {
		return effort;
	}

	@JsonProperty("effort")
	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	@JsonProperty("ownerID")
	public String getOwnerID() {
		return ownerID;
	}

	@JsonProperty("ownerID")
	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	@JsonProperty("estimatedDate")
	public Date getEstimatedDate() {
		return estimatedDate;
	}

	@JsonProperty("estimatedDate")
	public void setEstimatedDate(Date estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

	@JsonProperty("createdDate")
	public Date getCreatedDate() {
		return createdDate;
	}

	@JsonProperty("createdDate")
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@JsonProperty("metadaData")
	public Map<String, Object> getMetadaData() {
		return this.metadaData;
	}

	@JsonProperty("metadaData")
	public void setMetadaData(String name, Object value) {
		this.metadaData.put(name, value);
	}

}
