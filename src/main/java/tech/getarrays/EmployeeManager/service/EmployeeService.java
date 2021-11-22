package tech.getarrays.EmployeeManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.getarrays.EmployeeManager.exception.UserNotFoundException;
import tech.getarrays.EmployeeManager.model.Employee;
import tech.getarrays.EmployeeManager.repo.EmployeeRepo;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo){
            this.employeeRepo=employeeRepo;
    }

    /**
     * This method add employee
     * @param employee
     * @return
     */
    public Employee addEmployee(Employee employee){
         employee.setEmployeeCode(UUID.randomUUID().toString());
         return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    /**
     * This method will find employee id and if Id not found will give user not found exception
     * @param Id employee id
     * @return employee
     */
    public Employee findEmployeeById(Long Id){
        return employeeRepo.findEmployeeById(Id).
                orElseThrow(()-> new UserNotFoundException("User Id"+Id+"By ID"));
    }

    public void deleteEmployee(Long Id){
        employeeRepo.deleteEmployeeById(Id);
    }


}
