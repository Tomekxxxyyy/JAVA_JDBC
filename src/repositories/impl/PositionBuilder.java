package repositories.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Position;

public class PositionBuilder implements IEntityBuilder<Position> {

@Override
public Position build(ResultSet rs) throws SQLException {

Position position = new Position();
position.setId(rs.getInt("id"));
position.setName(rs.getString("name"));
return position;

}
}