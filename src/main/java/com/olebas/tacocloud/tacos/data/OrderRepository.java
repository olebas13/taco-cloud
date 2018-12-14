package com.olebas.tacocloud.tacos.data;

import com.olebas.tacocloud.tacos.Order;

public interface OrderRepository {

    Order save(Order order);
}
