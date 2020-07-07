package com.empathy.model.project;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.empathy.types.IssueLinkType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_ISSUE_LINK")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issueLinkID", "typeID", "createdBy", "createdDate" })
public class IssueLink {

	@EmbeddedId
	@JsonProperty("issueLinkID")
    private IssueLinkId issueLinkID;
	
	@Column(name = "TYPE_ID")
	@JsonProperty("typeID")
	IssueLinkType typeID;
		
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
	public IssueLink() {
	}

	/**
	 *
	 * @param issueLinkID
	 * @param createdBy
	 * @param createdDate 
	 */
	public IssueLink(IssueLinkId issueLinkID, String createdBy, Date createdDate) {
		super();
		this.issueLinkID = issueLinkID;
		this.createdBy = createdBy;
		this.createdDate = createdDate;		
	}
	
	
	
	/**
	 * @return the id
	 */
	public IssueLinkId getIssueLinkID() {
		return issueLinkID;
	}

	/**
	 * @param id the id to set
	 */
	public void setIssueLinkID(IssueLinkId issueLinkID) {
		this.issueLinkID = issueLinkID;
	}

	/**
	 * @return the typeID
	 */
	public IssueLinkType getTypeID() {
		return typeID;
	}

	/**
	 * @param typeID the typeID to set
	 */
	public void setTypeID(IssueLinkType typeID) {
		this.typeID = typeID;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the additionalProperties
	 */
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * @param additionalProperties the additionalProperties to set
	 */
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("Id", issueLinkID).append("createdBy", createdBy)
				.append("createdDate").toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(issueLinkID).append(createdBy).append(createdBy).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof IssueLink) == false) {
			return false;
		}
		IssueLink rhs = ((IssueLink) other);
		return new EqualsBuilder().append(issueLinkID, rhs.issueLinkID).append(createdDate, rhs.createdDate)
				.append(createdBy, rhs.createdBy).isEquals();
	}
}
