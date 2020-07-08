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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_SPRINT_BACKLOG")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "backlogID", "issueOrder", "issueLevel", "createdBy", "createdDate" })
public class Backlog {

	@EmbeddedId
	@JsonProperty("backlogID")
	private BacklogId backlogID;

	@NotNull
	@Column(name = "ISSUE_ORDER")
	@JsonProperty("issueOrder")
	private Integer issueOrder;
	
	@NotNull
	@Column(name = "ISSUE_LEVEL")
	@JsonProperty("issueLevel")
	private Integer issueLevel;

	@NotNull
	@Column(name = "CREATEDBY")
	@JsonProperty("createdBy")
	private String createdBy;

	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	@JsonProperty("createdDate")
	private Date createdDate;

	@Transient
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Backlog() {
	}

	/**
	 *
	 * @param backlogId
	 * @param capacity
	 * @param createdBy
	 * @param createdDate
	 */
	public Backlog(BacklogId backlogID, Integer issueOrder, String createdBy, Date createdDate) {
		super();
		this.backlogID = backlogID;
		this.issueOrder = issueOrder;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("backlogID", backlogID).append("issueOrder", issueOrder)
				.append("createdBy", createdBy).append("createdDate", createdDate)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(backlogID).append(createdBy).append(createdDate)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Backlog) == false) {
			return false;
		}
		Backlog rhs = ((Backlog) other);
		return new EqualsBuilder().append(backlogID, rhs.backlogID).append(createdBy, rhs.createdBy)
				.append(createdDate, rhs.createdDate).append(additionalProperties, rhs.additionalProperties).isEquals();
	}

	/**
	 * @return the issueLevel
	 */
	@JsonProperty("issueLevel")
	public Integer getIssueLevel() {
		return issueLevel;
	}

	/**
	 * @param issueLevel the issueLevel to set
	 */
	@JsonProperty("issueLevel")
	public void setIssueLevel(Integer issueLevel) {
		this.issueLevel = issueLevel;
	}

}
