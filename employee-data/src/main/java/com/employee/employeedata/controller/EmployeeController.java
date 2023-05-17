package com.employee.employeedata.controller;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.services.EmployeesService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeesService employeesService;


    @GetMapping("/employees")
    public List<Employee> getAll(){
        return this.employeesService.getAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable ("id") int id){
        return this.employeesService.getEmployee(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeesService.addEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeesService.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeesService.deleteEmployee(id);
    }

}
