package com.gora.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.common.model.entity.PrivilegeEntity;

public interface PrivilegeRepository extends JpaRepository<PrivilegeEntity, Long> {
}
