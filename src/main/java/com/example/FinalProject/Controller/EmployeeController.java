package com.example.FinalProject.Controller;

import com.example.FinalProject.Entity.Employee;
import com.example.FinalProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/emp")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @RequestMapping()
    public List<Employee> getallEmployees(){
        List<Employee> employees = employeeService.getAllEmployees();
        return employees.stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList());
    }

    @PostMapping()
    public Employee allemployees(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }

    @DeleteMapping()
    public void deleteEmployee(@PathVariable int empId){
         employeeService.deleteEmployee(empId);
    }
}
