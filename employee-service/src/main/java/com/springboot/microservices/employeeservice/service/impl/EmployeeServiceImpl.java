package com.springboot.microservices.employeeservice.service.impl;

import com.springboot.microservices.employeeservice.dto.EmployeeDto;
import com.springboot.microservices.employeeservice.entity.Employee;
import com.springboot.microservices.employeeservice.repository.EmployeeRepository;
import com.springboot.microservices.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeDto savedEmployeeDto = new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail()
        );
        return employeeDto;
    }
}
