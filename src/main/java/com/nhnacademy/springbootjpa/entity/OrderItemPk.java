package com.nhnacademy.springbootjpa.entity;

import lombok.*;

import java.io.Serializable;

// TODO #2: `OrderItem` Entity 클래스의 복합키 클래스인 `OrderItemPk` 클래스를 작성하세요.
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class OrderItemPk implements Serializable {
    private long orderId;
    private int lineNumber;
}
