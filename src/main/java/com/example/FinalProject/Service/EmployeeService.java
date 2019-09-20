package com.example.FinalProject.Service;

import com.example.FinalProject.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public Employee addEmployee(Employee employee);

    public void deleteEmployee(int empId);

}
