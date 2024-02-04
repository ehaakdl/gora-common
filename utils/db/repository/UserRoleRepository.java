package com.gora.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.db.entity.RoleEntity;
import com.gora.db.entity.UserEntity;
import com.gora.db.entity.UserRoleEntity;

public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {
    boolean existsByUserAndRole(UserEntity user, RoleEntity role);

    List<UserRoleEntity> findAllByUser(UserEntity user);
}
