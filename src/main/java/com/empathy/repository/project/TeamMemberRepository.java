package com.empathy.repository.project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.TeamMember;
import com.empathy.model.project.TeamMemberId;

@Repository
public interface TeamMemberRepository extends CrudRepository<TeamMember, TeamMemberId> {

}
