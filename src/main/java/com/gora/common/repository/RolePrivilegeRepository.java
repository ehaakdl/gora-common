package com.gora.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.common.model.entity.RolePrivilegeEntity;

public interface RolePrivilegeRepository extends JpaRepository<RolePrivilegeEntity, Long> {
}
