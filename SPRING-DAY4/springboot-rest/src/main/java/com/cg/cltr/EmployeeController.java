package com.cg.cltr;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	
//	@GetMapping("abc/{n}")
//	public String sayHi(@PathVariable("n") String name) {
//		return "Hi"+name;
//	}
	
//	@GetMapping()
//	public Employee getEmp() {	
//		return new Employee(1, "RAM", LocalDate.of(2002, 8, 12), 1000);
//	}
	
	@Autowired
	private IEmployeeService es;
	
//	@GetMapping()
//	public List<Employee> getEmp() {	
//		return es.getEmp();
//	}
	
//	@GetMapping("employees/{eid}")
//	public Employee getEmployee(@PathVariable int eid) {	
//		return es.getEmployee(eid);
//	}
	
//	@GetMapping("employees/{eid}")
//	public String removeEmployee(@PathVariable int eid) {	
//		return es.removeEmployee(eid);
//	}
	
//	@PostMapping
//	public Employee createEmp(@RequestBody Employee e) {
//		
//		return es.createEmp(e);
//	}
	
//	@DeleteMapping("{eid}")
//	public String removeEmployee(@PathVariable int eid) {	
//		return es.removeEmployee(eid);
//	}
//	
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee e) {	
		return es.updateEmployee(e);
	}

}
