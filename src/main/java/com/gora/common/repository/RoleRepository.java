package com.gora.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.common.model.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    Optional<RoleEntity> findByCode(String code);
}
