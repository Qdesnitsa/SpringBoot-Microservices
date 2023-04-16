package com.springboot.microservices.departmentservice.service.impl;

import com.springboot.microservices.departmentservice.dto.DepartmentDto;
import com.springboot.microservices.departmentservice.repository.DepartmentRepository;
import com.springboot.microservices.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        return null;
    }
}
