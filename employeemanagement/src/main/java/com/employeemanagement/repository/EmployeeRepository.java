package com.employeemanagement.repository;

import com.employeemanagement.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Query("SELECT e FROM Employee e WHERE e.email = ?1")
    public Employee findByEmail(String email);
    @Query("SELECT e FROM Employee e WHERE CONCAT(e.firstName, e.lastName, e.email, e.id) LIKE %?1%")
    public List<Employee> search(String keyword);

}
