package com.gora.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.db.entity.SocialUserEntity;

public interface SocialUserRepository extends JpaRepository<SocialUserEntity, Long> {
}
