package repositories.impl;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Company;

public class CompanyBuilder implements IEntityBuilder<Company> {

@Override
public Company build(ResultSet rs) throws SQLException {

Company company = new Company();
company.setId(rs.getInt("id"));
company.setName(rs.getString("name"));
company.setLegalStructure(rs.getString("legalstructure"));
company.setCompanyId(rs.getString("companyid"));
return company;

}
}