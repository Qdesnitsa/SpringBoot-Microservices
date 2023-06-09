package com.springboot.microservices.employeeservice.service;

import com.springboot.microservices.employeeservice.dto.ApiResponseDto;
import com.springboot.microservices.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    ApiResponseDto getEmployeeById(Long employeeId);
}
