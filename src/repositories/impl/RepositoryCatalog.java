package repositories.impl;

import java.sql.Connection;

import repositories.*;
import unitofwork.IUnitOfWork;

public class RepositoryCatalog implements IRepositoryCatalog{

	private Connection connection;
	private IUnitOfWork uow;
	
	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	@Override
	public ICompanyRepository getCompanies() {
		return new CompanyRepository(connection, new CompanyBuilder(), uow);
	}

	@Override
	public ICompanyAddressRepository getAddresses() {
		return new CompanyAddressRepository(connection, new CompanyAddressBuilder(), uow);
	}

	@Override
	public IEmployeeRepository getEmployees() {
		return new EmployeeRepository(connection, new EmployeeBuilder(), uow);
	}

	@Override
	public IPositionRepository getPositions() {
		return new PositionRepository(connection, new PositionBuilder(), uow);
	}

	@Override
	public ISalaryRepository getSalaries() {
		return new SalaryRepository(connection, new SalaryBuilder(), uow);
	}
}