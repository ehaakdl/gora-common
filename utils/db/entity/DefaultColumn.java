package com.gora.db.entity;

import java.util.Date;

import org.hibernate.annotations.*;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public abstract class DefaultColumn {
    @CreationTimestamp
    @Column
    private Date createdAt;
    @Column
    private Date deletedAt;
    @UpdateTimestamp
    @Column
    private Date updatedAt;
    @Column
    private Long createdBy;
    @Column
    // todo mysql 8 버전 on update 에 -1 추가못함
    @ColumnDefault("-1")
    private Long updatedBy;
    @Column
    private Long deletedBy;
}
