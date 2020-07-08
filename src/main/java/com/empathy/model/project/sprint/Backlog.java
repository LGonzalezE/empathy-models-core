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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_SPRINT_BACKLOG")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "backlogID", "issueOrder","createdBy", "createdDate" })
public class Backlog {

	@EmbeddedId
	@JsonProperty("backlogID")
	private BacklogId backlogID;

	@NotNull
	@Column(name = "ISSUE_ORDER")
	@JsonProperty("issueOrder")
	private Integer issueOrder;
		
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

	
	@JsonProperty("backlogID")
	public BacklogId getBacklogID() {
		return backlogID;
	}

	@JsonProperty("backlogID")
	public void setBacklogID(BacklogId backlogID) {
		this.backlogID = backlogID;
	}

	@JsonProperty("issueOrder")
	public Integer getIssueOrder() {
		return issueOrder;
	}

	@JsonProperty("issueOrder")
	public void setIssueOrder(Integer issueOrder) {
		this.issueOrder = issueOrder;
	}

	@JsonProperty("createdBy")
	public String getCreatedBy() {
		return createdBy;
	}

	@JsonProperty("createdBy")
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
