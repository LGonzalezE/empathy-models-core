package com.empathy.repository.projects;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.projects.Issue;

@Repository
public interface IssueRepository extends CrudRepository<Issue, String> {

}
