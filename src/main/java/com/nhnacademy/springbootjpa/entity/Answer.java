package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

// TODO #2: `answer` 테이블과 매핑될 `Answer` Entity 클래스를 작성하세요.
/*
 * create table answer
 * (
 *     id          bigint auto_increment
 *         primary key,
 *     question_id bigint   not null,
 *     content     text     not null,
 *     created_at  datetime not null
 * );
 */
@Entity
@NoArgsConstructor
@Getter
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long questionId;
    @NotNull
    private String content;
    @NotNull
    private ZonedDateTime createdAt;

    public Answer(long questionId, String content, ZonedDateTime createdAt) {
        this.questionId = questionId;
        this.content = content;
        this.createdAt = createdAt;
    }
}
