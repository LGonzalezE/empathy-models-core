package com.empathy.repository.sso.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empathy.model.sso.user.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
