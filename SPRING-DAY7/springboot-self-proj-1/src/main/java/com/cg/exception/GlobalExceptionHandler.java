package com.cg.exception;

import java.time.LocalDate;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.dto.ErrorDTO;

import jakarta.servlet.http.HttpServletRequest;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	//1-StudentNotFoundException=======================================
	//m1-
////	@ResponseBody      // ------ no need if use restcontrolleradvice ------
//	@ExceptionHandler(StudentNotFoundException.class)
//	@ResponseStatus(value = HttpStatus.NOT_FOUND)
//	public ErrorDTO handleException(StudentNotFoundException e, HttpServletRequest request) {
//		return new ErrorDTO(e.getMessage(), LocalDate.now(), request.getRequestURI());
//	}
	
	//m2-
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorDTO> handleException(StudentNotFoundException e, HttpServletRequest request){
		ErrorDTO err=new ErrorDTO(e.getMessage(), LocalDate.now(), request.getRequestURI());
		return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
	}
	
	
	//2-handleValidation======================================================
	//m1-
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
//	public ErrorDTO handleValidation(MethodArgumentNotValidException e, HttpServletRequest request) {
//		
////		String msg =e.getBindingResult().getFieldError().getDefaultMessage();
//		
////		return new ErrorDTO(msg, LocalDate.now(), request.getRequestURI());
//		
//		String errors =e.getBindingResult().getFieldErrors().stream().map(er->er.getDefaultMessage()).collect(Collectors.joining(", "));
//		
//		return new ErrorDTO(errors, LocalDate.now(), request.getRequestURI());
//		
//	}
	
	//m2-
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDTO> handleValidation(MethodArgumentNotValidException e, HttpServletRequest request){
		
		String errors =e.getBindingResult().getFieldErrors().stream().map(er->er.getDefaultMessage()).collect(Collectors.joining(", "));
		
		return new ResponseEntity<>(new ErrorDTO(errors, LocalDate.now(), request.getRequestURI()), HttpStatus.BAD_REQUEST);
	}
	
	//3-forrestallexception================================
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDTO> restException(Exception e, HttpServletRequest req){
		
		return new ResponseEntity<>(new ErrorDTO(e.getMessage(),LocalDate.now(), req.getRequestURI()), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
