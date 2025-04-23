package com.charlesmoloney.lombok;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Order order = new Order("test", 5, 5, true);
        System.out.println(order.getOrderId());
    }
}
