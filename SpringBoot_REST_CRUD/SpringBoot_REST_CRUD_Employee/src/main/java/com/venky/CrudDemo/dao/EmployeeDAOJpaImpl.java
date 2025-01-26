package com.venky.CrudDemo.dao;

import com.venky.CrudDemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

     private EntityManager entityManager;

      @Autowired
      public EmployeeDAOJpaImpl(EntityManager entityManager) {
          this.entityManager = entityManager;
      }

    @Override
    public List<Employee> getEmployees() {
         TypedQuery<Employee> query = entityManager.createQuery("SELECT e FROM Employee e", Employee.class);
         List<Employee> employees = query.getResultList();
         return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee fetchedEmployee = entityManager.find(Employee.class, id);
        return fetchedEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee savedEmployee = entityManager.merge(employee);
        return savedEmployee;
    }

    @Override
    public void deleteById(int id) {
          Employee employee = entityManager.find(Employee.class, id);
          entityManager.remove(employee);
    }
}
