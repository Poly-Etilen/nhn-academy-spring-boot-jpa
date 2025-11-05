package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = "line_number"))
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class OrderItem {
    @Id
    @Column(name = "order_item_id")
    private long orderItemId;

//    @Column(name = "order_id")
//    private long orderId;
    @ManyToOne
    private Order order;

    @Column(name = "line_number")
    private int lineNumber;

//    @Column(name = "item_id")
//    private long itemId;
    @ManyToOne(optional = false)
    private Item item;

    private int quantity;
}
