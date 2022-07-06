package com.employeemanagement.service;

import com.employeemanagement.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	List<Employee> listAll(String keyword);
}
