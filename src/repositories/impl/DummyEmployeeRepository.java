package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import repositories.*;
import domain.*;

public class DummyEmployeeRepository implements IEmployeeRepository{

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
		for(Employee e : db.employees)
			if(e.getId()==id)
				return e;
		return null;
		
	}

	@Override
	public List<Employee> getAll() {
		return db.employees;
	}

	@Override
	public List<Employee> withPosition(Position position) {
		return withPosition(position.getId());
	}

	@Override
	public List<Employee> withPosition(String positionName) {
		for(Position p: db.positions)
			if(p.getName().equals(positionName))
				return p.getEmployees();
		return new ArrayList<Employee>();
			
	}

	@Override
	public List<Employee> withPosition(int PositionId) {
		for(Position p: db.positions)
			if(p.getId()==PositionId)
				return p.getEmployees();
		return new ArrayList<Employee>();
	}

}