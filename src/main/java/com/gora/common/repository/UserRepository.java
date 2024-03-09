package com.gora.common.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.common.model.entity.UserEntity;
import com.gora.common.model.entity.eUserType;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailAndType(String email, eUserType userType);
    Optional<UserEntity> findByEmail(String email);
    boolean existsByEmail(String email);
    
}
