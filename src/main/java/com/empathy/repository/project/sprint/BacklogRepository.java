package com.empathy.repository.project.sprint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.sprint.Backlog;
import com.empathy.model.project.sprint.BacklogId;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, BacklogId> {

	@Query("SELECT b FROM Backlog b WHERE b.backlogID.sprintID = :sprintID and b.backlogID.projectID = :projectID")
	List<Backlog> findBySprintId(String sprintID, String projectID);

}
