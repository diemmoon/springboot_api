package com.example.springboot_api.service;

import com.example.springboot_api.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAll();
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(int id);
}
