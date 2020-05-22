package com.empathy.model.projects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "EMPATHY_PROJECT_ISSUE")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
public class Issue {

	@EmbeddedId
    private IssueId Id;
	
	@NotNull
	@JoinColumn(name = "TYPE_ID")
	@ManyToOne(fetch = FetchType.LAZY)
	private IssueType issueType;
		
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "OWNER_ID")
	private String ownerID;
	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	private Date createdDate;
	
	
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
}
