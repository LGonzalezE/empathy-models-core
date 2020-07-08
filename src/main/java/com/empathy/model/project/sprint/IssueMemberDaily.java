package com.empathy.model.project.sprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.empathy.model.project.Issue;
import com.empathy.types.IssueStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_SPRINT_ISSUE_MEMBER_DAILY")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issueMemberDailyID", "statusID", "description", "createdDate", "impediments", "metaData" })
public class IssueMemberDaily {

	@EmbeddedId
	@JsonProperty("issueMemberDailyID")
	private IssueMemberDailyId issueMemberDailyID;

	@NotNull
	@Column(name = "STATUS_ID")
	@JsonProperty("statusID")
	private IssueStatus statusID;

	@NotNull
	@Column(name = "DESCRIPTION")
	@JsonProperty("description")
	private String description;

	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	@JsonProperty("createdDate")
	private Date createdDate;

	@Transient
	@JsonProperty("impediments")
	private List<Issue> impediments = new ArrayList<Issue>();

	@Transient
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	@JsonProperty("issueMemberDailyID")
	public IssueMemberDailyId getIssueMemberDailyID() {
		return issueMemberDailyID;
	}

	@JsonProperty("issueMemberDailyID")
	public void setIssueMemberDailyID(IssueMemberDailyId issueMemberDailyID) {
		this.issueMemberDailyID = issueMemberDailyID;
	}

	@JsonProperty("statusID")
	public IssueStatus getStatusID() {
		return statusID;
	}

	@JsonProperty("statusID")
	public void setStatusID(IssueStatus statusID) {
		this.statusID = statusID;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("createdDate")
	public Date getCreatedDate() {
		return createdDate;
	}

	@JsonProperty("createdDate")
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@JsonProperty("impediments")
	public List<Issue> getImpediments() {
		return impediments;
	}

	@JsonProperty("impediments")
	public void setImpediments(List<Issue> impediments) {
		this.impediments = impediments;
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
