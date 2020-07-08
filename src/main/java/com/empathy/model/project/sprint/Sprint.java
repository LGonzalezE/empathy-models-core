package com.empathy.model.project.sprint;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.empathy.types.SprintStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_SPRINT")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sprintID", "name", "description", "startDate", "endDate", "createdBy", "createdDate" })
public class Sprint {

	@EmbeddedId
	@JsonProperty("sprintID")
	private SprintId sprintID;

	@NotNull
	@Column(name = "STATUS_ID")
	@JsonProperty("statusID")
	private SprintStatus statusID;

	@NotNull
	@Column(name = "NAME")
	@JsonProperty("name")
	private String name;

	@Column(name = "DESCRIPTION")
	@JsonProperty("description")
	private String description;

	@NotNull
	@Column(name = "STARTDATE")
	@JsonProperty("startDate")
	private Date startDate;

	@NotNull
	@Column(name = "ENDDATE")
	@JsonProperty("endDate")
	private Date endDate;

	@NotNull
	@Column(name = "CREATEDBY")
	@JsonProperty("createdBy")
	private String createdBy;

	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	@JsonProperty("createdDate")
	private Date createdDate;

	@Transient
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	@JsonProperty("sprintID")
	public SprintId getSprintID() {
		return sprintID;
	}

	@JsonProperty("sprintID")
	public void setSprintID(SprintId sprintID) {
		this.sprintID = sprintID;
	}

	@JsonProperty("statusID")
	public SprintStatus getStatusID() {
		return statusID;
	}

	@JsonProperty("statusID")
	public void setName(SprintStatus statusID) {
		this.statusID = statusID;
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

	@JsonProperty("createdBy")
	public String getCreatedBy() {
		return createdBy;
	}

	@JsonProperty("createdBy")
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@JsonProperty("startDate")
	public Date getStartDate() {
		return startDate;
	}

	@JsonProperty("startDate")
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("endDate")
	public Date getEndDate() {
		return endDate;
	}

	@JsonProperty("endDate")
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
