package com.example.springboot_api.controller;

import com.example.springboot_api.entity.Employee;
import com.example.springboot_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
    @PostMapping
    public Employee add( @RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }
    @PutMapping
    public  Employee update(@RequestBody  Employee employee){
        employeeService.updateEmployee(employee);
        return  employee;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
