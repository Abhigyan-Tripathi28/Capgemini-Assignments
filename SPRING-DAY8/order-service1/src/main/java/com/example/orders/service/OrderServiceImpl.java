package com.example.orders.service;

//import com.cg.dto.EntityMapper;
//import com.cg.entity.Student;
//import com.cg.exception.StudentNotFoundException;
import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	
	private OrderRepository orepo;
	
	@Autowired
	public OrderServiceImpl(OrderRepository orepo) {
		this.orepo= orepo;
	}

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
    	OrderEntity e = OrderMapper.toEntity(request);
        
//        return orepo.saveAndFlush(e);
    	return orepo.save(e);
    }

    @Override
    public OrderEntity getOrderById(Long id) {
        return orepo.findById(id).orElseThrow(OrderNotFoundException :: new);
//        Optional<OrderEntity> op = orepo.findById(id);
//		if(op.isPresent()) {
//			return OrderMapper.toResponseDTO(op.get());
//		}
//		
//		throw new OrderNotFoundException;
    }

    @Override
    public void deleteOrder(Long id) {
//    	if(orepo.findById(id).isPresent()) {
//			orepo.deleteById(id);
//			
//			throw new OrderNotFoundException();
//		}
    	if (!orepo.existsById(id)) {
            throw new OrderNotFoundException();   
        }

        orepo.deleteById(id);
    }
}
