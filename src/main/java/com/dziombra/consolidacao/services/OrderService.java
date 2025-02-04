package com.dziombra.consolidacao.services;

import com.dziombra.consolidacao.dto.OrderDTO;
import com.dziombra.consolidacao.entities.Order;
import com.dziombra.consolidacao.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById ( Long id) {
        Order order = repository.findById(id).get();
        return new OrderDTO(order);
    }

}
