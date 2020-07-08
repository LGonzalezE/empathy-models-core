package com.empathy.repository.project;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.TeamMemberProject;

@Repository
public interface TeamMemberProjectRepository extends CrudRepository<TeamMemberProject, String> {

	@Query("SELECT q FROM TeamMemberProject q WHERE q.memberID = :memberID ")
	List<TeamMemberProject> findByMemberID(String memberID);
}
