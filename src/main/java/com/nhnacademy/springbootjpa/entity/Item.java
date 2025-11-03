package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

// TODO #1: `item` 테이블과 매핑될 `Item` Entity 클래스를 작성하세요.
/*
 * create table item
 * (
 *     id    bigint auto_increment
 *         primary key,
 *     name  varchar(40) not null,
 *     price bigint      not null
 * );
 */
@Entity
@Getter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private long price;
}
