package com.empathy.model.sso.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "SSO_USER")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "userID", "name", "createdDate", "updatedDate" })
public class User {

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Column(name = "USER_ID")
	@JsonProperty("userID")
	private String userID;

	@Column(name = "NAME")
	@JsonProperty("name")
	private String name;

	@Column(name = "CREATEDDATE", insertable = false, updatable = false)
	@JsonProperty("createdDate")
	private Date createdDate;

	@Column(name = "UPDATEDDATE", insertable = false, updatable = true)
	@JsonProperty("updatedDate")
	private Date updatedDate;

	@Transient
	@JsonProperty("metaData")
	private Map<String, Object> metaData = new HashMap<String, Object>();

	/**
	 * @return the userID
	 */
	@JsonProperty("userID")
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	@JsonProperty("userID")
	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * @return the name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the createdDate
	 */
	@JsonProperty("createdDate")
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	@JsonProperty("createdDate")
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	@JsonProperty("updatedDate")
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate the updatedDate to set
	 */
	@JsonProperty("updatedDate")
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
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
