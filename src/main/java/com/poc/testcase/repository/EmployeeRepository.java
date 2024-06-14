package com.poc.testcase.repository;

import com.poc.testcase.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Optional<Employee> findByEmail(String email);

}