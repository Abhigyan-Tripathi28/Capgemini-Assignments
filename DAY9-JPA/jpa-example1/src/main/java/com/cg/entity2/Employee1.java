package com.cg.entity2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="employee_dept_table")
@Data
@ToString
public class Employee1 {
	@Id
	private int eid;
	private String name;
	private String dept;

}
