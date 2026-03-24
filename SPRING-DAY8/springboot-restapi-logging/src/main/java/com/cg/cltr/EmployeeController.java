package com.cg.cltr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.EmployeeDTO;
//import com.cg.dto.StudentDTO;
import com.cg.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/emps")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService es;
	
	@PostMapping
	public ResponseEntity<EmployeeDTO> createEmpl(@Valid @RequestBody EmployeeDTO edto){
		
		EmployeeDTO created = es.createEmployee(edto);
		return new ResponseEntity<>(created, HttpStatus.CREATED);
	}
	
//	@GetMapping
//	public ResponseEntity<List<EmployeeDTO>> findAllStud() {
//	    return new ResponseEntity<>(es.getAllEmployee(), HttpStatus.OK);
//	}
//	
	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> findAllStud(HttpSession ses) {
		if(ses.getAttribute("name")!=null) {
			return new ResponseEntity<>(es.getAllEmployee(), HttpStatus.OK);
		}
		else {
			return new ResponseEntity("login to access", HttpStatus.UNAUTHORIZED);
		}
	}
	

}
