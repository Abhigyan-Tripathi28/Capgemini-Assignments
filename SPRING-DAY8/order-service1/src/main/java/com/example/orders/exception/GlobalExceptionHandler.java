package com.example.orders.exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> handleNotFound(OrderNotFoundException e) {
        return new ResponseEntity<>("Order not found", HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, Object>> handleValidation(MethodArgumentNotValidException e){
		
		List<String> ers= e.getBindingResult().getFieldErrors().stream().map(er->er.getDefaultMessage()).toList();
		
		Map<String, Object> ans= new HashMap<>();
		ans.put("timestamp", LocalDate.now().toString());
		ans.put("errors", ers);
		
		return new ResponseEntity<>(ans,HttpStatus.BAD_REQUEST);
	}

    
}
