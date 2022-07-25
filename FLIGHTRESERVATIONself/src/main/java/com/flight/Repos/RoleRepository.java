package com.flight.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
