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

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "projectID", "name", "description", "tags", "ownerID", "estimatedDate", "createdDate" })
public class Project {

	@Id
	@Column(name = "PROJECT_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
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

	@JsonProperty("metaData")
	public Map<String, Object> getMetaData() {
		return this.metaData;
	}

	@JsonProperty("metaData")
	public void setMetaData(String name, Object value) {
		this.metaData.put(name, value);
	}


}
