package com.empathy.repository.project.sprint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.sprint.BacklogIssue;

@Repository
public interface BacklogIssueRepository extends CrudRepository<BacklogIssue, String> {

	@Query("SELECT q FROM BacklogIssue q WHERE q.sprintID = :sprintID ")
	List<BacklogIssue> findBySprintId(String sprintID);

	@Query("SELECT q FROM BacklogIssue q WHERE q.sprintID = :sprintID and q.parentID = :parentID")
	List<BacklogIssue> findBySprintID(String sprintID, String parentID);

	@Query("SELECT q FROM BacklogIssue q WHERE q.parentID = :parentID")
	List<BacklogIssue> findByChildsByParentID(String parentID);

	@Query("SELECT q FROM BacklogIssue q WHERE q.sprintID = :sprintID and q.parentID is null")
	List<BacklogIssue> findRootBySprintID(String sprintID);
	
	
}
