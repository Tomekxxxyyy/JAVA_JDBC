package repositories.impl;

import java.util.List;
import repositories.IRepository;
import domain.Company;

public class DummyCompanyRepository implements IRepository<Company> {
	
		
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

}
