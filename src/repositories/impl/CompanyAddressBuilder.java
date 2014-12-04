package repositories.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.CompanyAddress;

public class CompanyAddressBuilder implements IEntityBuilder<CompanyAddress> {

@Override
public CompanyAddress build(ResultSet rs) throws SQLException {

CompanyAddress address = new CompanyAddress();
address.setId(rs.getInt("id"));
address.setCountry(rs.getString("country"));
address.setCity(rs.getString("city"));
address.setPostalCode(rs.getString("postalcode"));
address.setStreet(rs.getString("street"));
address.setHouseNumber(rs.getString("housenumber"));

return address;

}
}