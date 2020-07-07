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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.empathy.model.project.Issue;
import com.empathy.types.IssueStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_SPRINT_ISSUE_MEMBER_DAILY")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issueMemberDailyID", "statusID", "description", "createdDate", "metaData" })
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

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public IssueMemberDaily() {
	}

	/**
	 *
	 * @param backlogId
	 * @param capacity
	 * @param description
	 * @param createdDate
	 */
	public IssueMemberDaily(IssueMemberDailyId issueMemberDailyID, IssueStatus statusID, String description, Date createdDate) {
		super();
		this.issueMemberDailyID = issueMemberDailyID;
		this.statusID = statusID;
		this.description = description;
		this.createdDate = createdDate;
	}

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

	@JsonProperty("metaData")
	public Map<String, Object> getMetaData() {
		return this.metaData;
	}

	@JsonProperty("metaData")
	public void setMetaData(String name, Object value) {
		this.metaData.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("issueMemberDailyID", issueMemberDailyID).append("statusID", statusID)
				.append("description", description).append("createdDate", createdDate)
				.append("additionalProperties", metaData).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(issueMemberDailyID).append(statusID).append(description).append(createdDate)
				.append(metaData).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof IssueMemberDaily) == false) {
			return false;
		}
		IssueMemberDaily rhs = ((IssueMemberDaily) other);
		return new EqualsBuilder().append(issueMemberDailyID, rhs.issueMemberDailyID).append(statusID, rhs.statusID).append(description, rhs.description)
				.append(createdDate, rhs.createdDate).append(metaData, rhs.metaData).isEquals();
	}

	/**
	 * @return the impediments
	 */
	@JsonProperty("impediments")
	public List<Issue> getImpediments() {
		return impediments;
	}

	/**
	 * @param impediments the impediments to set
	 */
	@JsonProperty("impediments")
	public void setImpediments(List<Issue> impediments) {
		this.impediments = impediments;
	}

}
