package com.empathy.model.project;

import java.io.Serializable;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IssueLinkId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "PARENT_ID")
	@JsonProperty("parentID")
	private String parentID;
	
	@Column(name = "CHILD_ID")
	@JsonProperty("childID")
	private String childID;

	public IssueLinkId() {

	}

	public IssueLinkId(String parentID, String toID, String childID) {
		this.parentID = parentID;
		this.childID = childID;
	}

	/**
	 * @return the issueID
	 */
	public String getParentID() {
		return parentID;
	}

	/**
	 * @param issueID the issueID to set
	 */
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	/**
	 * @return the issueID
	 */
	public String getChildID() {
		return childID;
	}

	/**
	 * @param issueID the issueID to set
	 */
	public void setChildID(String childID) {
		this.childID = childID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parentID == null) ? 0 : parentID.hashCode());
		result = prime * result + ((childID == null) ? 0 : childID.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IssueLinkId other = (IssueLinkId) obj;

		if (childID == null) {
			if (other.childID != null)
				return false;
		} else if (!childID.equals(other.childID))
			return false;

		if (parentID == null) {
			if (other.parentID != null)
				return false;
		} else if (!parentID.equals(other.parentID))
			return false;
		return true;
	}
}
