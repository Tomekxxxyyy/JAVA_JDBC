package repositories.impl;

import java.sql.*;
import java.util.List;

import domain.Employee;
import domain.Position;
import repositories.IPositionRepository;
import unitofwork.IUnitOfWork;

public class PositionRepository extends Repository<Position> implements IPositionRepository
{

	public PositionRepository(Connection connection, IEntityBuilder<Position> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Position entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setInt(2, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Position entity) throws SQLException {	
		insert.setString(1, entity.getName());
				
	}

	@Override
	protected String getTableName() {
		return "positions";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO positions(name) values(?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update positions set (name)=(?) where id=?";
	}

	@Override
	public List<Position> withEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position> withEmployee(String employeeSurname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Position> withEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}