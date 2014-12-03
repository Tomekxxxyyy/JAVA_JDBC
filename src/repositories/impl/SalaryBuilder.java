package repositories.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Salary;

public class SalaryBuilder implements IEntityBuilder<Salary> {

@Override
public Salary build(ResultSet rs) throws SQLException {

Salary salary = new Salary();
salary.setId(rs.getInt("id"));
salary.setAmount(rs.getString("amount"));
return salary;

}
}