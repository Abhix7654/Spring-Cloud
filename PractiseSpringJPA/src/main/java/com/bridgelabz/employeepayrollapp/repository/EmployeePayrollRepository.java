package com.bridgelabz.employeepayrollapp.repository;

import com.bridgelabz.employeepayrollapp.model.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Integer> {
    @Query(value = "SELECT ep.* FROM employee_payroll ep " +
            "JOIN employee_department ed ON ep.employee_id = ed.employee_id " +
            "WHERE ed.department = :department", nativeQuery = true)
    List<EmployeePayroll> findEmployeesByDepartment(String department);
}
