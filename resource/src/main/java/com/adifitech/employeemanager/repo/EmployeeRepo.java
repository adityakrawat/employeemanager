package com.adifitech.employeemanager.repo;

import java.util.Optional;

import com.adifitech.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
    Optional<Employee> findEmployeeById(Long id);

    @Transactional
    void deleteEmployeeById(Long id);
}
