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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.GenericGenerator;

import com.empathy.types.IssueType;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_ISSUE")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issueID", "projectID", "typeID", "name", "description", "effort", "ownerID", "estimatedDate",
		"createdDate" })
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
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Issue() {
	}

	/**
	 *
	 * @param issueID
	 * @param createdDate
	 * @param name
	 * @param estimatedDate
	 * @param description
	 * @param typeID
	 * @param effort
	 * @param ownerID
	 * @param projectID
	 */
	public Issue(String issueID, String projectID, IssueType typeID, String name, String description, Integer effort,
			String ownerID, Date estimatedDate, Date createdDate) {
		super();
		this.issueID = issueID;
		this.projectID = projectID;
		this.typeID = typeID;
		this.name = name;
		this.description = description;
		this.effort = effort;
		this.ownerID = ownerID;
		this.estimatedDate = estimatedDate;
		this.createdDate = createdDate;
	}

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
		return new ToStringBuilder(this).append("issueID", issueID).append("projectID", projectID)
				.append("typeID", typeID).append("name", name).append("description", description)
				.append("effort", effort).append("ownerID", ownerID).append("estimatedDate", estimatedDate)
				.append("createdDate", createdDate).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(issueID).append(createdDate).append(name).append(estimatedDate)
				.append(description).append(typeID).append(effort).append(additionalProperties).append(ownerID)
				.append(projectID).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Issue) == false) {
			return false;
		}
		Issue rhs = ((Issue) other);
		return new EqualsBuilder().append(issueID, rhs.issueID).append(createdDate, rhs.createdDate)
				.append(name, rhs.name).append(estimatedDate, rhs.estimatedDate).append(description, rhs.description)
				.append(typeID, rhs.typeID).append(effort, rhs.effort)
				.append(additionalProperties, rhs.additionalProperties).append(ownerID, rhs.ownerID)
				.append(projectID, rhs.projectID).isEquals();
	}

}
