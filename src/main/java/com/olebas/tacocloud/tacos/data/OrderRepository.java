package com.olebas.tacocloud.tacos.data;

import com.olebas.tacocloud.tacos.Order;
import com.olebas.tacocloud.tacos.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
