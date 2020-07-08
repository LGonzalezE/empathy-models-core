package com.empathy.model.project;

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

import com.empathy.types.IssueStatus;
import com.empathy.types.IssueType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_ISSUE")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issueID", "projectID", "parentID", "typeID", "statusID", "name", "description", "effort",
		"ownerID", "estimatedDate", "createdDate", "metaData" })
public class Issue {

	@Id
	@Column(name = "ISSUE_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@JsonProperty("issueID")
	private String issueID;

	@Column(name = "PROJECT_ID")
	@JsonProperty("projectID")
	private String projectID;

	@Column(name = "PARENT_ID")
	@JsonProperty("parentID")
	private String parentID;

	@Column(name = "TYPE_ID")
	@NotNull
	@JsonProperty("typeID")
	private IssueType typeID;

	@Column(name = "STATUS_ID")
	@NotNull
	@JsonProperty("statusID")
	private IssueStatus statusID;

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
	 * No args constructor for use in serialization
	 *
	 */

	@JsonProperty("issueID")
	public String getIssueID() {
		return issueID;
	}

	@JsonProperty("issueID")
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	@JsonProperty("projectID")
	public String getProjectID() {
		return projectID;
	}

	@JsonProperty("projectID")
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@JsonProperty("parentID")
	public String getParentID() {
		return parentID;
	}

	@JsonProperty("parentID")
	public void setParentID(String parentID) {
		this.parentID = parentID;
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

	@JsonProperty("metaData")
	public Map<String, Object> getMetaData() {
		return this.metaData;
	}

	@JsonProperty("metaData")
	public void setMetaData(String name, Object value) {
		this.metaData.put(name, value);
	}

}
