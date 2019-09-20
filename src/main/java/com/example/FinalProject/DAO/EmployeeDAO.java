package com.example.FinalProject.DAO;

import com.example.FinalProject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
