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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
	@JsonIgnore	
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Project() {
	}

	/**
	 *
	 * @param createdDate
	 * @param name
	 * @param estimatedDate
	 * @param description
	 * @param ownerID
	 * @param projectID
	 * @param tags
	 */
	public Project(String projectID, String name, String description, String tags, String ownerID, Date estimatedDate,
			Date createdDate) {
		super();
		this.projectID = projectID;
		this.name = name;
		this.description = description;
		this.tags = tags;
		this.ownerID = ownerID;
		this.estimatedDate = estimatedDate;
		this.createdDate = createdDate;
	}

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
		return new ToStringBuilder(this).append("projectID", projectID).append("name", name)
				.append("description", description).append("tags", tags).append("ownerID", ownerID)
				.append("estimatedDate", estimatedDate).append("createdDate", createdDate)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(createdDate).append(name).append(estimatedDate).append(description)
				.append(additionalProperties).append(ownerID).append(projectID).append(tags).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Project) == false) {
			return false;
		}
		Project rhs = ((Project) other);
		return new EqualsBuilder().append(createdDate, rhs.createdDate).append(name, rhs.name)
				.append(estimatedDate, rhs.estimatedDate).append(description, rhs.description)
				.append(additionalProperties, rhs.additionalProperties).append(ownerID, rhs.ownerID)
				.append(projectID, rhs.projectID).append(tags, rhs.tags).isEquals();
	}

}
