package com.gora.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.db.entity.PrivilegeEntity;

public interface PrivilegeRepository extends JpaRepository<PrivilegeEntity, Long> {
}
