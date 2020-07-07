package com.empathy.repository.project.sprint;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.project.sprint.IssueMemberDaily;
import com.empathy.model.project.sprint.IssueMemberDailyId;

@Repository
public interface IssueMemberDailyRepository extends CrudRepository<IssueMemberDaily, IssueMemberDailyId> {

}
