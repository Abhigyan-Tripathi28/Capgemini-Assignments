package com.cg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Integer>{
	
	//You didn’t write SQL, but you can:
//	| Method       | Works Automatically |
//	| ------------ | ------------------- |
//	| save()       | insert/update       |
//	| findAll()    | select *            |
//	| findById()   | select by id        |
//	| deleteById() | delete              |

//	Because of:-->extends JpaRepository<Employee, Integer>
	//Employee-->entity class
	//Integer-->primary key type
	
	public List<Employee> findByName(String name);
	
	@Query("select e from Employee e where e.sal >=:n")
	public List<Employee> findBySal(@Param("n") double sal); 
	
	public List<Employee> findByNameOrderBySalDesc(String name);
	
}
