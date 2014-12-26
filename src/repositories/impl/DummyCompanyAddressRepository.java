package repositories.impl;

import java.util.*;

import repositories.ICompanyAddressRepository;
import domain.*;

public class DummyCompanyAddressRepository implements ICompanyAddressRepository{
	
	public DummyCompanyAddressRepository(DummyDb db){
		this.db=db;
	}
	
	private DummyDb db;

	@Override
	public void save(CompanyAddress entity) {
		db.addresses.add(entity);

	}

	@Override
	public void update(CompanyAddress entity) {
		

	}

	@Override
	public void delete(CompanyAddress entity) {
		db.addresses.remove(entity);

	}

	@Override
	public CompanyAddress get(int id) {
		for(CompanyAddress a : db.addresses)
			if(a.getId()==id)
				return a;
		return null;
	}

	@Override
	public List<CompanyAddress> getAll() {
		return db.addresses;
	}

	@Override
	public List<CompanyAddress> withCompany(Company company) {
		return withCompany(company.getId());
	}

	@Override
	public List<CompanyAddress> withCompany(String companyName) {
		for(Company c: db.companies)
			if(c.getName().equals(companyName))
				return c.getAddresses();
		return new ArrayList<CompanyAddress>();
	}

	@Override
	public List<CompanyAddress> withCompany(int addressId) {
		for(Company c: db.companies)
			if(c.getId()==addressId)
				return c.getAddresses();
		return new ArrayList<CompanyAddress>();
	}

}
