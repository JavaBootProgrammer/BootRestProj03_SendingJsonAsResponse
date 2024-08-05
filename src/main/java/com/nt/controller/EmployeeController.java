package com.nt.controller;

import com.nt.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/report")
	public ResponseEntity<Employee> getEmployee() {

		Employee employee = new Employee(1, "Raja", "USA", "9999");

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}
}
