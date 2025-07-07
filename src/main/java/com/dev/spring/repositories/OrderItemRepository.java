package com.dev.spring.repositories;

import com.dev.spring.entities.OrderItem;
import com.dev.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
