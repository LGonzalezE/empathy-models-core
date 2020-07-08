package com.empathy.repository.project.sprint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.sprint.TeamMemberSprintIssue;

@Repository
public interface TeamMemberSprintIssueRepository extends CrudRepository<TeamMemberSprintIssue, String> {

	@Query("SELECT q FROM TeamMemberSprintIssue q WHERE q.sprintID = :sprintID and q.memberID = :memberID and q.issueLevel = :issueLevel")
	List<TeamMemberSprintIssue> findByMemberId(String memberID, String sprintID, Integer issueLevel);

	@Query("SELECT q FROM TeamMemberSprintIssue q WHERE q.sprintID = :sprintID and q.memberID = :memberID and q.parentID = :parentID AND q.issueLevel = :issueLevel")
	List<TeamMemberSprintIssue> findByMemberId(String memberID, String sprintID, String parentID, Integer issueLevel);
	
	
}
