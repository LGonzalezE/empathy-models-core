package com.empathy.model.projects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Immutable
@Table(name = "V_EMPATHY_PROJECT_TEAM")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
public class VProjectTeam {
	@Id
	@Column(name = "PROJECT_ID")
	String projectID;
	@Column(name = "NAME")
	String name;
	@Column(name = "DESCRIPTION")
	String description;
	@Column(name = "TAGS")
	String tags;
	@Column(name = "OWNER_ID")
	String ownerID;
	@Column(name = "CREATEDDATE")
	Date createdDate;
	@Column(name = "MEMBER_ID")
	String memberID;
	/**
	 * @return the projectID
	 */
	public String getProjectID() {
		return projectID;
	}
	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}
	/**
	 * @return the ownerID
	 */
	public String getOwnerID() {
		return ownerID;
	}
	/**
	 * @param ownerID the ownerID to set
	 */
	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
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
	 * @return the memberID
	 */
	public String getMemberID() {
		return memberID;
	}
	/**
	 * @param memberID the memberID to set
	 */
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	
}
