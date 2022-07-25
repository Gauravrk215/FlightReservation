package com.flight.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
