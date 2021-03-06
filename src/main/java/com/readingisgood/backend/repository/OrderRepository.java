package com.readingisgood.backend.repository;

import com.readingisgood.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByUserId(Long userid);

    Order findByIdAndUserId(Long id, Long userid);

}
