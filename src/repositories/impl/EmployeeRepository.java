package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.Position;
import repositories.IRepository;
import repositories.IEmployeeRepository;

public class EmployeeRepository extends Repository<Employee> implements IEmployeeRepository
{

	public EmployeeRepository(Connection connection, IEntityBuilder<Employee> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(Employee entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getSurname());
		update.setInt(3, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Employee entity) throws SQLException {	
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getSurname());
		
	}

	@Override
	protected String getTableName() {
		return "employees";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO employees(name,surname) values(?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update employees set (name,surname)=(?,?) where id=?";
	}

	@Override
	public List<Employee> withPosition(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> withPosition(String positionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> withPosition(int PositionId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}