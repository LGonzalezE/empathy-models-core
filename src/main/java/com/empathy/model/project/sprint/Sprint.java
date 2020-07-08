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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_SPRINT")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sprintID", "name", "description", "startDate", "endDate", "createdBy",
		"createdDate" })
public class Sprint {

	@EmbeddedId	
	@JsonProperty("sprintID")
	private SprintId sprintID;

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
	private Map<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Sprint() {
	}

	/**
	 *
	 * @param sprintID
	 * @param name
	 * @param description
	 * @param startDate
	 * @param endDate
	 * @param createdBy
	 * @param createdDate
	 */
	public Sprint(SprintId sprintID, String name, String description, Date startDate, Date endDate, String createdBy,
			Date createdDate) {
		super();
		this.sprintID = sprintID;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	@JsonProperty("sprintID")
	public SprintId getSprintID() {
		return sprintID;
	}

	@JsonProperty("sprintID")
	public void setSprintID(SprintId sprintID) {
		this.sprintID = sprintID;
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

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("sprintID", sprintID).append("name", name)
				.append("description", description).append("startDate", startDate).append("endDate", endDate)
				.append("createdBy", createdBy).append("createdDate", createdDate)
				.append("additionalProperties", metaData).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(sprintID).append(name).append(description).append(startDate)
				.append(endDate).append(createdBy).append(createdDate).append(metaData).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Sprint) == false) {
			return false;
		}
		Sprint rhs = ((Sprint) other);
		return new EqualsBuilder().append(sprintID, rhs.sprintID).append(name, rhs.name)
				.append(description, rhs.description).append(startDate, rhs.startDate)
				.append(endDate, rhs.endDate).append(createdBy, rhs.createdBy)
				.append(createdDate, rhs.createdDate).append(metaData, rhs.metaData).isEquals();
	}

}
