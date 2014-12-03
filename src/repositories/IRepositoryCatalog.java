package repositories;

import domain.*;

public interface IRepositoryCatalog {

	public IRepository<Company> getCompanies();
	public IRepository<CompanyAddress> getAddresses();
	public IRepository<Employee> getEmployees();
	public IRepository<Position> getPositions();
	public IRepository<Salary> getSalaries();
}