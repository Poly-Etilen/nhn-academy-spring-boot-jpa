package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.*;
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
    @Lob //좀 더 큰 text타입을 자동으로 생성함.
    private String content;
    @NotNull
    private ZonedDateTime createdAt;
}
