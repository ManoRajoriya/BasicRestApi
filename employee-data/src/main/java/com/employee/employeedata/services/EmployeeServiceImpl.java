package com.employee.employeedata.services;

import com.employee.employeedata.dao.EmployeeDao;
import com.employee.employeedata.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeesService {

    //List<Employee> list;


    @Autowired
    public EmployeeDao employeeDao;


    @Override
    public List<Employee> getAll() {
        return employeeDao.findAll();
    }


    @Override

    public Employee getEmployee(int id) {
        return employeeDao.getReferenceById(id);
        
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeDao.save(employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee){
        employeeDao.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Employee entity = employeeDao.getReferenceById(id);
        employeeDao.delete(entity);
    }

}
