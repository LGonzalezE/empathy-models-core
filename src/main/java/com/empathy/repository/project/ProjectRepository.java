package com.empathy.repository.project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project, String> {
		
	
}
