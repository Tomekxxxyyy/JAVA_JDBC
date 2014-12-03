package repositories.impl;

import domain.*;
import repositories.*;

public class DummyRepositoryCatalog implements IRepositoryCatalog{

	DummyDb db = new DummyDb();
	
	@Override
	public IRepository<Company> getCompanies() {
		return new DummyCompanyRepository(db);
	}

	@Override
	public IRepository<CompanyAddress> getAddresses() {
		return new DummyCompanyAddressRepository(db);
	}

	@Override
	public IRepository<Employee> getEmployees() {
		return new DummyEmployeeRepository(db);
	}
	
	public IRepository<Position> getPositions() {
		return new DummyPositionRepository(db);
	}
	
	public IRepository<Salary> getSalaries() {
		return new DummySalaryRepository(db);
	}

}