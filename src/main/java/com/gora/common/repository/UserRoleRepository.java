package com.gora.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.common.model.entity.RoleEntity;
import com.gora.common.model.entity.UserEntity;
import com.gora.common.model.entity.UserRoleEntity;

public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {
    boolean existsByUserAndRole(UserEntity user, RoleEntity role);
    List<UserRoleEntity> findAllByUser(UserEntity user);
}
