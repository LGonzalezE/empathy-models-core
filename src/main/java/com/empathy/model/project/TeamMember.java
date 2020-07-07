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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "PROJECT_TEAM_MEMBER")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "teamMemberID", "capacity", "createdDate" })
public class TeamMember {

	@EmbeddedId
	@JsonProperty("teamMemberID")
    private TeamMemberId teamMemberID;
	
		
	@Column(name = "CAPACITY")
	@JsonProperty("capacity")
	private Integer capacity;

	
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
	public TeamMember() {
	}

	/**
	 *
	 * @param issueLinkID
	 * @param capacity
	 * @param createdDate 
	 */
	public TeamMember(TeamMemberId teamMemberID, Integer capacity, Date createdDate) {
		super();
		this.teamMemberID = teamMemberID;
		this.capacity = capacity;
		this.createdDate = createdDate;		
	}
	
	
	
	/**
	 * @return the teamMemberID
	 */
	public TeamMemberId getTeamMemberID() {
		return teamMemberID;
	}

	/**
	 * @param teamMemberID the teamMemberID to set
	 */
	public void setIssueLinkID(TeamMemberId teamMemberID) {
		this.teamMemberID = teamMemberID;
	}

	
	/**
	 * @return the createdBy
	 */
	public Integer getCreatedBy() {
		return capacity;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Integer createdBy) {
		this.capacity = createdBy;
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
		return new ToStringBuilder(this).append("teamMemberID", teamMemberID).append("capacity", capacity)
				.append("createdDate").toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(teamMemberID).append(capacity).append(createdDate).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TeamMember) == false) {
			return false;
		}
		TeamMember rhs = ((TeamMember) other);
		return new EqualsBuilder().append(teamMemberID, rhs.teamMemberID).append(capacity, rhs.capacity).append(createdDate, rhs.createdDate)
				.append(capacity, rhs.capacity).isEquals();
	}
}
