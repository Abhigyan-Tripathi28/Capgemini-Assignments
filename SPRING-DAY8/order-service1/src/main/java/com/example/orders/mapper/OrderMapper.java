package com.example.orders.mapper;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;

public class OrderMapper {

    public static OrderEntity toEntity(OrderRequestDTO dto) {
        OrderEntity e = new OrderEntity(dto.getCustomerName(), dto.getEmail(), dto.getProductName(),dto.getQuantity(),dto.getPricePerUnit());
        
        
    	if (dto.getQuantity() != null && dto.getPricePerUnit() != null) {
            e.setTotalAmount(dto.getQuantity() * dto.getPricePerUnit());
        }
    	
    	return e;
    }

    public static OrderResponseDTO toResponseDTO(OrderEntity entity) {
//        OrderResponseDTO dto = new OrderResponseDTO();
//        return dto;
    	return new OrderResponseDTO(entity.getId(), entity.getCustomerName(),entity.getEmail(), entity.getProductName(),entity.getQuantity(),entity.getPricePerUnit(), entity.getTotalAmount());
    }
}
