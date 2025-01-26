package com.venky.CrudDemo.service;

import com.venky.CrudDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
