package com.venky.CrudDemo.dao;

import com.venky.CrudDemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployees();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);


}
