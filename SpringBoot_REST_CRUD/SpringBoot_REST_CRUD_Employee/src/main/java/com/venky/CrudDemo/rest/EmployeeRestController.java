package com.venky.CrudDemo.rest;

import com.venky.CrudDemo.entity.Employee;
import com.venky.CrudDemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") int employeeId) {
        Employee fetchingEmployee = employeeService.findById(employeeId);
        if(fetchingEmployee == null){
            throw new RuntimeException("Employee not found");
        }
        return fetchingEmployee;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        Employee savedEmployee = employeeService.save(employee);
        return savedEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        Employee updatingEmployee = employeeService.save(employee);
        return updatingEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable("employeeId") int employeeId) {
        Employee fetchingEmployee = employeeService.findById(employeeId);
        if(fetchingEmployee == null){
            throw new RuntimeException("Employee not found");
        }
        employeeService.deleteById(employeeId);
        return "Employee deleted Successfully {EmployeeId: " + employeeId + "}";
    }
}
