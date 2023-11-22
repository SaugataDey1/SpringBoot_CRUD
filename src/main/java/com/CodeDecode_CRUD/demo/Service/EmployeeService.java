package com.CodeDecode_CRUD.demo.Service;

import com.CodeDecode_CRUD.demo.Entity.Employee;
import com.CodeDecode_CRUD.demo.Repos.EmployeeCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface
{
    @Autowired
    private EmployeeCrudRepo crudRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        Employee savedEmployee = crudRepo.save(employee);
        return savedEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return crudRepo.findAll();
    }

    @Override
    public Employee getEmpById(Long empId) {
        return crudRepo.findById(empId).get();
    }

    @Override
    public void deleteEmpById(Long empId) {
        crudRepo.deleteById(empId);
    }
}
