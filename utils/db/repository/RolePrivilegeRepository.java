package com.gora.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.db.entity.RolePrivilegeEntity;

public interface RolePrivilegeRepository extends JpaRepository<RolePrivilegeEntity, Long> {
}
