package com.empathy.model.project.sprint;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SprintId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "SPRINT_ID")
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@JsonProperty("sprintID")
	private String sprintID;

	@NotNull
	@Column(name = "PROJECT_ID")
	@JsonProperty("projectID")
	private String projectID;

	public SprintId() {

	}

	public SprintId(String sprintID, String projectID) {
		this.sprintID = sprintID;
		this.projectID = projectID;
	}

	/**
	 * @return the sprintID
	 */
	public String getSprintID() {
		return sprintID;
	}

	/**
	 * @param sprintID the sprintID to set
	 */
	public void setSprintID(String sprintID) {
		this.sprintID = sprintID;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sprintID == null) ? 0 : sprintID.hashCode());
		result = prime * result + ((projectID == null) ? 0 : projectID.hashCode());
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
		SprintId other = (SprintId) obj;

		if (projectID == null) {
			if (other.projectID != null)
				return false;
		} else if (!projectID.equals(other.projectID))
			return false;

		if (sprintID == null) {
			if (other.sprintID != null)
				return false;
		} else if (!sprintID.equals(other.sprintID))
			return false;
		return true;
	}
}
