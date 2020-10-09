package com.my.kotlin.start;

/**
 * 客户
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void placeOrder() {
        System.out.println("A new order is placed by " + name);
    }
}
