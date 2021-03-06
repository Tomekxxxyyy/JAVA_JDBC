package repositories.impl;

import java.sql.*;

import repositories.ICompanyRepository;
import unitofwork.IUnitOfWork;
import domain.Company;
import domain.CompanyAddress;

public class CompanyRepository 
extends Repository<Company> implements ICompanyRepository
{

	public CompanyRepository(Connection connection, IEntityBuilder<Company> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	protected void setUpUpdateQuery(Company entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getLegalStructure());
		update.setString(3, entity.getCompanyId());
		update.setInt(4, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(Company entity) throws SQLException {	
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getLegalStructure());
		insert.setString(3, entity.getCompanyId());
		
	}

	@Override
	protected String getTableName() {
		return "companies";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO companies(name,legalstructure,companyid) values(?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update companies set (name,legalstructure,companyid)=(?,?,?) where id=?";
	}

	@Override
	public Company withAddress(CompanyAddress address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company withAddress(String addressStreet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company withAddress(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}