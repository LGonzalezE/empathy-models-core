package com.empathy.repository.project.sprint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.sprint.Sprint;
import com.empathy.model.project.sprint.SprintId;

@Repository
public interface SprintRepository extends CrudRepository<Sprint, SprintId> {

	@Query("SELECT q FROM Sprint q WHERE q.sprintID.projectID = :projectID")
	List<Sprint> findByProjectId(String projectID);

}
