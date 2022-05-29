package com.itshop.entities;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private int id;
    private int customerId;
    private String address;
    private BigDecimal total;
    private List<OrderItem> items;


}
