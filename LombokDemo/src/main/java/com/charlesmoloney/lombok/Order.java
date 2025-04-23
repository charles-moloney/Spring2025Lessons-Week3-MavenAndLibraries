package com.charlesmoloney.lombok;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    private String orderId;
    private double totalAmount;
    private int numItems;
    private boolean isLoyalCustomer;
}
