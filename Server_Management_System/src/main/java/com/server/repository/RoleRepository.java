package com.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.server.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
