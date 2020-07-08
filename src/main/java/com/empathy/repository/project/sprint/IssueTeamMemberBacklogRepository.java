package com.empathy.repository.project.sprint;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.IssueTeamMemberBacklog;

@Repository
public interface IssueTeamMemberBacklogRepository extends CrudRepository<IssueTeamMemberBacklog, String> {
	
	@Query("SELECT b FROM IssueTeamMemberBacklog b WHERE b.parentID = :parentID and b.ownerID = :memberID")
	List<IssueTeamMemberBacklog> findByMemberId(String memberID, String parentID);

	@Query("SELECT b FROM IssueTeamMemberBacklog b WHERE b.parentID = :parentID and b.ownerID = :memberID")
	List<IssueTeamMemberBacklog> findByStringIdAndMemberId(String memberID, String parentID);

}
