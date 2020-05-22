package com.empathy.model.projects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

@Embeddable
public class IssueId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ISSUE_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String issueID;
	@Column(name = "PROJECT_ID")
	private String projectID;

	public IssueId() {

	}

	public IssueId(String issueID, String projectID) {
		this.issueID = issueID;
		this.projectID = projectID;
	}

	/**
	 * @return the issueID
	 */
	public String getIssueID() {
		return issueID;
	}

	/**
	 * @param issueID the issueID to set
	 */
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectID == null) ? 0 : projectID.hashCode());
		result = prime * result + ((issueID == null) ? 0 : issueID.hashCode());
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
		IssueId other = (IssueId) obj;
		if (projectID == null) {
			if (other.projectID != null)
				return false;
		} else if (!projectID.equals(other.projectID))
			return false;
		if (issueID == null) {
			if (other.issueID != null)
				return false;
		} else if (!issueID.equals(other.issueID))
			return false;
		return true;
	}
}
