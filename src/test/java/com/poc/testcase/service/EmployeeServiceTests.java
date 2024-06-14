package com.poc.testcase.service;

import com.poc.testcase.entity.Employee;
import com.poc.testcase.exception.ResourceNotFoundException;
import com.poc.testcase.repository.EmployeeRepository;
import com.poc.testcase.service.impl.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class EmployeeServiceTests {


    private EmployeeRepository employeeRepository;

    
    private EmployeeServiceImpl employeeService;

    private Employee employee;

    @BeforeEach
    public void setup() {
        log.info("Call from /@BeforeEach from setup method");
        employee = Employee.builder()
                    .id(1L)
                .firstName("Ajay")
                .lastName("Sharma")
                .email("ajay1.sharma@yash.com")
                .build();
    }


    @DisplayName("Sample test")
    @Test
    public void test() {

    }
}



