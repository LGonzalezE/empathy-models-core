package com.empathy.repository.project;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.IssueLink;
import com.empathy.model.project.IssueLinkId;

@Repository
public interface IssueLinkRepository extends CrudRepository<IssueLink, IssueLinkId> {

	
	@Query("SELECT i FROM IssueLink i WHERE i.issueLinkID.parentID = :parentID")
	List<IssueLink> findByParentId(String parentID);

}
