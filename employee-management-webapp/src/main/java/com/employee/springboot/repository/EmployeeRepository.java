package com.employee.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.springboot.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Query("SELECT e FROM Employee e WHERE CONCAT(e.firstName, e.lastName, e.email, e.id) LIKE %?1%")
    public List<Employee> search(String keyword);

}
