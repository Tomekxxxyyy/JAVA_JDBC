package repositories.impl;

import java.util.List;

import repositories.ICompanyRepository;
import domain.Company;
import domain.CompanyAddress;

public class DummyCompanyRepository implements ICompanyRepository {
	
		
	public DummyCompanyRepository(DummyDb db){
		this.db=db;
	}
	
	private DummyDb db;
		
	@Override
	public void save(Company entity) {
		db.companies.add(entity);

	}

	@Override
	public void update(Company entity) {
		

	}

	@Override
	public void delete(Company entity) {
		db.companies.remove(entity);

	}

	@Override
	public Company get(int id) {
		for(Company company : db.companies)
			if(company.getId()==id)
				return company;
		return null;
		
	}

	@Override
	public List<Company> getAll() {
		return db.companies;
	}

	@Override
	public Company withAddress(CompanyAddress address) {
		return withAddress(address.getId());
	}

	@Override
	public Company withAddress(String addressStreet) {
		for(CompanyAddress ca: db.addresses)
			if(ca.getStreet()==addressStreet)
				return ca.getCompany();
		return new Company();
	}

	@Override
	public Company withAddress(int companyId) {
		for(CompanyAddress ca : db.addresses )
			if(ca.getId()==companyId)
				return ca.getCompany();
		return new Company();
	}

}
