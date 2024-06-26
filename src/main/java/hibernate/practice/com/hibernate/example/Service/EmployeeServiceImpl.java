package hibernate.practice.com.hibernate.example.Service;

import java.util.ArrayList;
import java.util.Optional;

import hibernate.practice.com.hibernate.example.Model.Employee;
import hibernate.practice.com.hibernate.example.Repository.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//  @Service marks a Java class that performs some service,
//  such as executing business logic, performing
//  calculations, and calling external APIs.
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepositoryImpl employeeRepository;

    @Override
    public ArrayList<Employee> findAllEmployee() {
        return (ArrayList<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findAllEmployeeByID(long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;
    }

    @Override
    public void addEmployee() {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Lucknow", "Shubham"));
        emp.add(new Employee("Delhi", "Puneet"));
        emp.add(new Employee("Pune", "Abhay"));
        emp.add(new Employee("Noida", "Anurag"));
        for (Employee employee : emp) {
            employeeRepository.save(employee);
        }
    }

    @Override
    public void deleteAllData() {
        employeeRepository.deleteAll();
    }

    @Override
    public Employee saveEmployee(Employee Employee) {
        return employeeRepository.save(Employee);
    }

    @Override
    public Employee getEmployeeById(long id) {

        return  employeeRepository.findById(id).get();
    }
    @Override
    public Employee updateEmployee(Employee employee) {
      return   employeeRepository.save(employee);

    }
    @Override
    public void deleteEmployee(Employee employee) {
         employeeRepository.delete(employee);
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }


    public long countRows() {

        return employeeRepository.count();
    }




}
