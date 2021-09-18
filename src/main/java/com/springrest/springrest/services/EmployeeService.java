package com.springrest.springrest.services;

import com.springrest.springrest.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> getEmployee();
    public Employee getEmployee(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(int id);
}
