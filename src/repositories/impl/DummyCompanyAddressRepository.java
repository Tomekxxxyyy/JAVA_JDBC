package repositories.impl;

import java.util.List;
import repositories.IRepository;
import domain.CompanyAddress;

public class DummyCompanyAddressRepository implements IRepository<CompanyAddress> {
	
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
		for(CompanyAddress address : db.addresses)
			if(address.getId()==id)
				return address;
		return null;
	}

	@Override
	public List<CompanyAddress> getAll() {
		return db.addresses;
	}

}
