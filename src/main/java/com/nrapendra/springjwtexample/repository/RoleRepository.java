package com.nrapendra.springjwtexample.repository;

import java.util.Optional;

import com.nrapendra.springjwtexample.models.ERole;
import com.nrapendra.springjwtexample.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
