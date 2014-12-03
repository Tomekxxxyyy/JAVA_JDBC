package repositories.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Employee;

public class EmployeeBuilder implements IEntityBuilder<Employee> {

@Override
public Employee build(ResultSet rs) throws SQLException {

Employee employee = new Employee();
employee.setId(rs.getInt("id"));
employee.setName(rs.getString("name"));
employee.setSurname(rs.getString("surname"));
return employee;

}
}
