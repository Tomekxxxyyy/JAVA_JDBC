package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.CompanyAddress;
import repositories.IRepository;
//import repositories.ICompanyAddressRepository;

public class CompanyAddressRepository extends Repository<CompanyAddress> // implements ICompanyAddressRepository
{

	public CompanyAddressRepository(Connection connection, IEntityBuilder<CompanyAddress> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(CompanyAddress entity) throws SQLException {
		update.setString(1, entity.getCountry());
		update.setString(2, entity.getCity());
		update.setString(3, entity.getPostalCode());
		update.setString(4, entity.getStreet());
		update.setString(5, entity.getHouseNumber());
		update.setInt(6, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(CompanyAddress entity) throws SQLException {	
		insert.setString(1, entity.getCountry());
		insert.setString(2, entity.getCity());
		insert.setString(3, entity.getPostalCode());
		insert.setString(4, entity.getStreet());
		insert.setString(5, entity.getHouseNumber());
	}

	@Override
	protected String getTableName() {
		return "companyaddresses";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO companyaddresses(country,city,postalcode,street,housenumber) values(?,?,?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update companyaddresses set (country,city,postalcode,street,housenumber)=(?,?,?,?,?) where id=?";
	}
	
}