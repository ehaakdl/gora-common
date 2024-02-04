package com.gora.db.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.db.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByCode(String code);
}
