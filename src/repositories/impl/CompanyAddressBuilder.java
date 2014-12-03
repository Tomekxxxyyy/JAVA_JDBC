package repositories.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.CompanyAddress;

public class CompanyAddressBuilder implements IEntityBuilder<CompanyAddress> {

@Override
public CompanyAddress build(ResultSet rs) throws SQLException {

CompanyAddress companyAddress = new CompanyAddress();
companyAddress.setId(rs.getInt("id"));
companyAddress.setCountry(rs.getString("country"));
companyAddress.setCity(rs.getString("city"));
companyAddress.setPostalCode(rs.getString("postalcode"));
companyAddress.setStreet(rs.getString("street"));
companyAddress.setHouseNumber(rs.getString("housenumber"));

return companyAddress;

}
}