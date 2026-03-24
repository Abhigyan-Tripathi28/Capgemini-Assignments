package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.service.OrderService;
import com.example.orders.service.OrderServiceImpl;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
	
	
	private OrderService os;
	
	@Autowired
	public OrderController(OrderService os) {
		this.os=os;
		
	}

    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {
       return new ResponseEntity<>(OrderMapper.toResponseDTO(os.createOrder(request)),HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {
    	return new ResponseEntity<>(OrderMapper.toResponseDTO(os.getOrderById(id)),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
    	os.deleteOrder(id);
    	return new ResponseEntity<>("Order deleted successfully",HttpStatus.OK);
    }
}
