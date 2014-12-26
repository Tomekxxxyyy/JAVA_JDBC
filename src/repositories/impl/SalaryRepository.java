package repositories.impl;

import java.sql.*;
import java.util.List;

import domain.Position;
import domain.Salary;
import repositories.ISalaryRepository;
import unitofwork.IUnitOfWork;

public class SalaryRepository extends Repository<Salary> implements ISalaryRepository
{

	public SalaryRepository(Connection connection, IEntityBuilder<Salary> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Salary entity) throws SQLException {
		update.setString(1, entity.getAmount());
		update.setInt(2, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Salary entity) throws SQLException {	
		insert.setString(1, entity.getAmount());
				
	}

	@Override
	protected String getTableName() {
		return "salaries";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO salaries(amount) values(?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update salaries set (amount)=(?) where id=?";
	}

	@Override
	public List<Salary> withPosition(Position position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Salary> withPosition(String positionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Salary> withPosition(int positionId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}