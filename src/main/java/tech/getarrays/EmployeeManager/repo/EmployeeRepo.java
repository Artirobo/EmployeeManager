package tech.getarrays.EmployeeManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.EmployeeManager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    /**
     * This will create a query with jpa repository as delete employee by Id
     * @param id : Employee Id to delete from data base
     */
    void deleteEmployeeById(Long id);
    /**
     * This method is set as option is that because while finding employee there might not found employe and error might occur
     *
     * @param id : Employee Id to delete from data base
     */
    Optional<Employee> findEmployeeById(Long id);
}
