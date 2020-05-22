package com.empathy.model.projects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "EMPATHY_PROJECT_ISSUE_TYPE")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})
public class IssueType {
	@Id	
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")	
	@Column(name = "TYPE_ID")
	private String typeID;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
}
