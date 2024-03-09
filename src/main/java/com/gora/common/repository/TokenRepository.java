package com.gora.common.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gora.common.model.entity.TokenEntity;
import com.gora.common.model.entity.UserEntity;
import com.gora.common.model.entity.eTokenUseDBType;

public interface TokenRepository extends JpaRepository<TokenEntity, Long> {
        Optional<TokenEntity> findByAccess(String accessToken);

        Optional<TokenEntity> findByUserAndTypeAndAccessExpireAtAfter(UserEntity user, eTokenUseDBType type,
                        Date accessExpireAt);

        Optional<TokenEntity> findByAccessAndTypeAndAccessExpireAtAfter(String accessToken, eTokenUseDBType type,
                        Date accessExpireAt);

        void deleteByAccess(String accessToken);

        Optional<TokenEntity> findByAccessAndType(String accessToken, eTokenUseDBType type);

        List<TokenEntity> findByUserAndType(UserEntity user, eTokenUseDBType type);

        void deleteByUserAndType(UserEntity user, eTokenUseDBType type);
}
