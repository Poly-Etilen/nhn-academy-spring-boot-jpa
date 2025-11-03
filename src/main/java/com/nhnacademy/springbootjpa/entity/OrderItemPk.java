package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// TODO #2: `OrderItem` Entity 클래스의 복합키 클래스인 `OrderItemPk` 클래스를 작성하세요.
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class OrderItemPk {
    private long orderId;
    private int lineNumber;
}
