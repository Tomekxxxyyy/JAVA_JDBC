package repositories.impl;

import java.util.List;
import repositories.IRepository;
import domain.Salary;

public class DummySalaryRepository implements IRepository<Salary> {

	public DummySalaryRepository(DummyDb db){
		this.db=db;
	}
	
	private DummyDb db;
		
	@Override
	public void save(Salary entity) {
		db.salaries.add(entity);

	}

	@Override
	public void update(Salary entity) {
		

	}

	@Override
	public void delete(Salary entity) {
		db.salaries.remove(entity);

	}

	@Override
	public Salary get(int id) {
		for(Salary salary : db.salaries)
			if(salary.getId()==id)
				return salary;
		return null;
		
	}

	@Override
	public List<Salary> getAll() {
		return db.salaries;
	}

}
