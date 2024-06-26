package hibernate.practice.com.hibernate.example.Service;

import hibernate.practice.com.hibernate.example.Model.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();

    Employee saveEmployee(Employee Employee);


    Employee getEmployeeById(long id);

     Employee updateEmployee(Employee employee);
     void  deleteEmployee(Employee   employee);

     void deleteEmployeeById(long id);


}



