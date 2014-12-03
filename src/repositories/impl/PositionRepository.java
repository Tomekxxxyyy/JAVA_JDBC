package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Position;
import repositories.IRepository;
//import repositories.IPositionRepository;

public class PositionRepository extends Repository<Position> // implements IPositionRepository
{

	public PositionRepository(Connection connection, IEntityBuilder<Position> builder) {
		super(connection, builder);
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
	
}