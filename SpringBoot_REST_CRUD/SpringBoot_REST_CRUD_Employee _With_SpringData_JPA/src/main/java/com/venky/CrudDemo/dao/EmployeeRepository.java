package com.venky.CrudDemo.dao;

import com.venky.CrudDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //No need to extend the implementation class
}
