package com.gora.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.db.entity.EmailVerifyEntity;

public interface EmailVerifyRepository extends JpaRepository<EmailVerifyEntity, Long> {
    List<EmailVerifyEntity> findAllByEmail(String email);
}
