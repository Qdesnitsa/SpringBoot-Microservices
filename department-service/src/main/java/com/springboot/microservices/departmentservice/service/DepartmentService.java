package com.springboot.microservices.departmentservice.service;

import com.springboot.microservices.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
}
