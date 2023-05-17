package com.employee.employeedata.services;

import com.employee.employeedata.model.Employee;

import java.util.List;

//Created Interface for the purpose of loose coupling
public interface EmployeesService {

    public List<Employee> getAll();

    public Employee getEmployee(int id);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(int id);

}
