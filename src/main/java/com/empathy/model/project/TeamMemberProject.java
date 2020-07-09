package com.empathy.model.project;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Immutable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Immutable
@Table(name = "V_PROJECT_TEAM_MEMBER_PROJECT")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "projectID", "name", "description", "tags", "ownerID", "estimatedDate", "createdDate", "memberID",
		"capacity" })
public class TeamMemberProject {

	@Id
	@Column(name = "PROJECT_ID")
	@JsonProperty("projectID")
	private String projectID;

	@Column(name = "NAME")
	@JsonProperty("name")
	private String name;

	@Column(name = "DESCRIPTION")
	@JsonProperty("description")
	private String description;

	@Column(name = "TAGS")
	@JsonProperty("tags")
	private String tags;

	@Column(name = "OWNER_ID")
	@JsonProperty("ownerID")
	private String ownerID;

	@Column(name = "ESTIMATEDDATE")
	@JsonProperty("estimatedDate")
	private Date estimatedDate;

	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	@JsonProperty("createdDate")
	private Date createdDate;

	@Column(name = "MEMBER_ID")
	@JsonProperty("memberID")
	private String memberID;

	@Column(name = "CAPACITY")
	@JsonProperty("capacity")
	private Integer capacity;

	@Transient
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	@JsonProperty("projectID")
	public String getProjectID() {
		return projectID;
	}

	@JsonProperty("projectID")
	public void setProjectID(String projectID) {
		this.projectID = projectID;
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

	@JsonProperty("tags")
	public String getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(String tags) {
		this.tags = tags;
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

	@JsonProperty("memberID")
	public String getMemberID() {
		return memberID;
	}

	@JsonProperty("memberID")
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	@JsonProperty("capacity")
	public Integer getCapacity() {
		return capacity;
	}

	@JsonProperty("capacity")
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
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
