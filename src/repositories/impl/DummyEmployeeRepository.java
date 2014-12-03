package repositories.impl;

import java.util.List;
import repositories.IRepository;
import domain.Employee;

public class DummyEmployeeRepository implements IRepository<Employee> {

	public DummyEmployeeRepository(DummyDb db){
		this.db=db;
	}
	
	private DummyDb db;
		
	@Override
	public void save(Employee entity) {
		db.employees.add(entity);

	}

	@Override
	public void update(Employee entity) {
		

	}

	@Override
	public void delete(Employee entity) {
		db.employees.remove(entity);

	}

	@Override
	public Employee get(int id) {
		for(Employee employee : db.employees)
			if(employee.getId()==id)
				return employee;
		return null;
		
	}

	@Override
	public List<Employee> getAll() {
		return db.employees;
	}

}