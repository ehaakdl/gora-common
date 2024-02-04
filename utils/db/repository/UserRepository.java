package com.gora.db.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.db.entity.UserEntity;
import com.gora.db.entity.eUserType;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailAndType(String email, eUserType userType);

    Optional<UserEntity> findByEmail(String email);

    boolean existsByEmail(String email);

}
