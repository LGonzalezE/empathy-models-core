package com.empathy.repository.project;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.Issue;

@Repository
public interface IssueRepository extends CrudRepository<Issue, String> {

	@Query("SELECT q FROM Issue q WHERE q.parentID = :issueID")
	public List<Issue> findChildByIssueID(String issueID);
}
