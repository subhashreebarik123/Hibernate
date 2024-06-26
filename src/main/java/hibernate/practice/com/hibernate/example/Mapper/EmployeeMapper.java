package hibernate.practice.com.hibernate.example.Mapper;

import hibernate.practice.com.hibernate.example.Model.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;


    @Component
    public class EmployeeMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();

            employee.setName(rs.getString("name"));
            employee.setCity(rs.getString("city"));
            return employee;
        }
}
