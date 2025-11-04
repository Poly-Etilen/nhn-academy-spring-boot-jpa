package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.ZonedDateTime;

// TODO #1: `question` 테이블과 매핑될 `Question` Entity 클래스를 작성하세요.
/*
 * create table question
 * (
 *     id         bigint auto_increment
 *         primary key,
 *     title      varchar(100) not null,
 *     content    text         not null,
 *     created_at datetime     not null
 * );
 */
@Entity
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull
    private ZonedDateTime createdAt;
}
