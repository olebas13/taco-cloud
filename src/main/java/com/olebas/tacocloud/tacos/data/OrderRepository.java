package com.olebas.tacocloud.tacos.data;

import com.olebas.tacocloud.tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
