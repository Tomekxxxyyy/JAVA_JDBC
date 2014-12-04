package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import repositories.*;
import domain.*;

public class DummySalaryRepository implements ISalaryRepository {

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

	@Override
	public List<Salary> withPosition(Position position) {
		return withPosition(position.getId());
	}

	@Override
	public List<Salary> withPosition(String positionName) {
		for(Position p: db.positions)
			if(p.getName()==positionName)
				return p.getSalaries();
		return new ArrayList<Salary>();
	}

	@Override
	public List<Salary> withPosition(int positionId) {
		for(Position p: db.positions)
			if(p.getId()==positionId)
				return p.getSalaries();
		return new ArrayList<Salary>();
				
		
	}

}
