package com.empathy.repository.projects;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empathy.model.projects.Project;
import com.empathy.model.projects.VProjectTeam;
@Repository
public interface ProjectRepository extends CrudRepository<Project, String> {
		
	@Query("SELECT q FROM VProjectTeam q WHERE q.memberID = :memberID")
	public List<VProjectTeam> findByMemberId(@Param("memberID") String memberID);
	
	@Query("SELECT q FROM VProjectTeam q WHERE q.projectID = :projectID AND q.memberID = :memberID")
	public VProjectTeam findByMemberId(@Param("projectID") String projectID, @Param("memberID") String memberID);

	@Query("SELECT q FROM Project q WHERE q.name = :projectName AND q.ownerID = :ownerID")
	public Project findByOwnerId(@Param("ownerID") String ownerId, @Param("projectName") String projectName);

}
