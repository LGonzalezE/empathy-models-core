package com.empathy.repository.project.sprint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.sprint.IssueTeamMember;

@Repository
public interface IssueTeamMemberRepository extends CrudRepository<IssueTeamMember, String> {

	@Query("SELECT m FROM IssueTeamMember m WHERE m.parentIssueID = :parentIssueID")
	List<IssueTeamMember> findByParentId(String parentIssueID);

	@Query("SELECT m FROM IssueTeamMember m WHERE m.sprintID = :sprintID and m.parentIssueID = :parentIssueID")
	List<IssueTeamMember> findByParentId(String sprintID, String parentIssueID);

}
