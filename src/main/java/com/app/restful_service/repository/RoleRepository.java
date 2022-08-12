package com.app.restful_service.repository;

import com.app.restful_service.model.ERole;
import com.app.restful_service.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
