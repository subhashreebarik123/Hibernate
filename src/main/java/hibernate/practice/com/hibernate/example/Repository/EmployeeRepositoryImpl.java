package hibernate.practice.com.hibernate.example.Repository;

import hibernate.practice.com.hibernate.example.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository
public interface EmployeeRepositoryImpl extends JpaRepository<Employee, Long> {
    // ArrayList<Employee> findAllEmployee();


}

