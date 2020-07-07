package com.empathy.repository.project.sprint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.sprint.BacklogIssue;

@Repository
public interface BacklogIssueRepository extends CrudRepository<BacklogIssue, String> {

	@Query("SELECT b FROM BacklogIssue b WHERE b.sprintID = :sprintID")
	List<BacklogIssue> findBySprintId(String sprintID);

}
