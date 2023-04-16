package com.springboot.microservices.departmentservice.repository;

import com.springboot.microservices.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
