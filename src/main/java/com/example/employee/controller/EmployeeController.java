package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.model.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee/{id}")
    public Employee getEmployee(
            @PathVariable("id") String id,
            @RequestParam(name="fname") String fname,
            @RequestParam(name="lname") String lname,
            @RequestParam(name="age") int age,
            @RequestParam(name="department") String department,
            @RequestParam(name="designation") String designation,
            @RequestParam(name="domain") String domain
    ){
        Role role = new Role(department, designation, domain);
        return new Employee(id, fname, lname, age, role);
    }
}
