package com.empathy.repository.project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.Issue;

@Repository
public interface IssueRepository extends CrudRepository<Issue, String> {

}
