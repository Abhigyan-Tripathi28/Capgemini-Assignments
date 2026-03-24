package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.StudentDTO;
import com.cg.service.IStudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private IStudentService ss;
	
	@Autowired
	public StudentController(IStudentService ss) {
		this.ss=ss;
	}
	
	//1-create-------------->
//	@PostMapping
//	public StudentDTO createStud(@Valid @RequestBody StudentDTO sdto) {
//		return ss.createStudent(sdto);
//	}
	
	@PostMapping
	public ResponseEntity<StudentDTO> createStud(@Valid @RequestBody StudentDTO sdto){
		StudentDTO created = ss.createStudent(sdto);
		return new ResponseEntity<>(created, HttpStatus.CREATED);
	}
	
	//2-getall---------------->
//	@GetMapping
//	public List<StudentDTO> findAllStud(){
//		return ss.getAllStudent();
//	}
	
//	@GetMapping
//	public ResponseEntity<List<StudentDTO>> findAllStud() {
//	    return  ResponseEntity.ok(ss.getAllStudent());
//	}
	
	@GetMapping
	public ResponseEntity<List<StudentDTO>> findAllStud() {
	    return new ResponseEntity<>(ss.getAllStudent(), HttpStatus.OK);
	}
	
	//3-getbyId--------------->
//	@GetMapping("/{id}")
//	public StudentDTO findStudById(@PathVariable int id) {
//		return ss.getStudentById(id);
//	}
	
	@GetMapping("/{id}")
	public ResponseEntity<StudentDTO> findStudById(@PathVariable int id){
		return ResponseEntity.ok(ss.getStudentById(id));
	}
	
	//4-getbyname--------------->
//	@GetMapping("/name/{name}")
//	public List<StudentDTO> findStudByName(@PathVariable String name){
//		return ss.getStudentByName(name);
//	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<StudentDTO>> findStudByName(@PathVariable String name){
		return ResponseEntity.ok(ss.getStudentByName(name));
	}
	
	//5-delete----------------------->
//	@DeleteMapping("/{id}")
//	public String deleteStudById(@PathVariable int id) {
//		return ss.deleteStudent(id);
//	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudById(@PathVariable int id) {
		return ResponseEntity.ok(ss.deleteStudent(id));
	}
	
	//6-update------------------------>
//	@PutMapping
//	public StudentDTO updateStud(@Valid @RequestBody StudentDTO sdto) {
//		return ss.updateStudent(sdto);
//	}
	
	@PutMapping
	public ResponseEntity<StudentDTO > updateStud(@Valid @RequestBody StudentDTO sdto) {
		return ResponseEntity.ok(ss.updateStudent(sdto));
	}

}
