package com.empathy.repository.project;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project, String> {
		
	@Query("SELECT q FROM Project q WHERE q.name = :projectName AND q.ownerID = :ownerID")
	public Project findByOwnerId(@Param("ownerID") String ownerId, @Param("projectName") String projectName);

	@Query("SELECT q FROM Project q WHERE q.ownerID = :ownerID")
	public List<Project> findByOwnerId(String ownerID);

}
