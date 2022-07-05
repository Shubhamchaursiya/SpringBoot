package com.employeemanagement.service;

import com.employeemanagement.model.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
