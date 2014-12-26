package repositories.impl;

import java.sql.*;
import java.util.List;

import domain.Employee;
import domain.Position;
import repositories.IEmployeeRepository;
import unitofwork.IUnitOfWork;

public class EmployeeRepository extends Repository<Employee> implements IEmployeeRepository
{

	public EmployeeRepository(Connection connection, IEntityBuilder<Employee> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
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