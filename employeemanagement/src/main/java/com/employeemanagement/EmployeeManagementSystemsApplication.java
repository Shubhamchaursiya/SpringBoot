package com.employeemanagement;

import com.employeemanagement.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)

public class EmployeeManagementSystemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemsApplication.class, args);
	}

}
