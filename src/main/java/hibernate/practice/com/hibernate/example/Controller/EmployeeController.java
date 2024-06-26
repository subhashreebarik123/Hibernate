package hibernate.practice.com.hibernate.example.Controller;

import java.util.ArrayList;

import hibernate.practice.com.hibernate.example.Model.Employee;
import hibernate.practice.com.hibernate.example.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl empServiceImpl;

    @PostMapping("/")
    public void add() {
        empServiceImpl.addEmployee();
    }

    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
        return empServiceImpl.findAllEmployee();
    }

    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeUsingId(@PathVariable long id) {
        return empServiceImpl.findAllEmployeeByID(id);
    }

    @DeleteMapping("/delete")
    public void delete() {
        empServiceImpl.deleteAllData();
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
        return empServiceImpl.saveEmployee(employee);
    }

    @GetMapping("/count")
    public long countRows() {
        return empServiceImpl.countRows();
    }


    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable long  id)
    {

        return empServiceImpl.getEmployeeById(id);
    }

    @DeleteMapping("/employee/delete")
    public String deleteEmployee(@RequestBody  Employee employee){
        empServiceImpl.deleteEmployee(employee);
        return "Employee deleted having employee id:" ;
    }

    @PutMapping("/employee/update")
    public  void updateEmployee(@RequestBody Employee employee){
       empServiceImpl.updateEmployee(employee);

    }
    @DeleteMapping("/employees/{id}")
    public void   deleteEmployeeById(@PathVariable("id") long id ){
       empServiceImpl.deleteEmployeeById(id);

    }

}