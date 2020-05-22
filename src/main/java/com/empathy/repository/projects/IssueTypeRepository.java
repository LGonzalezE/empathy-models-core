package com.empathy.repository.projects;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.projects.IssueType;

@Repository
public interface IssueTypeRepository extends CrudRepository<IssueType, String> {

}
