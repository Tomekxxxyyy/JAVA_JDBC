package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import repositories.*;
import domain.*;

public class DummyPositionRepository implements IPositionRepository {

	public DummyPositionRepository(DummyDb db){
		this.db=db;
	}
	
	private DummyDb db;
		
	@Override
	public void save(Position entity) {
		db.positions.add(entity);

	}

	@Override
	public void update(Position entity) {
		

	}

	@Override
	public void delete(Position entity) {
		db.positions.remove(entity);

	}

	@Override
	public Position get(int id) {
		for(Position p : db.positions)
			if(p.getId()==id)
				return p;
		return null;
		
	}

	@Override
	public List<Position> getAll() {
		return db.positions;
	}

	@Override
	public List<Position> withEmployee(Employee employee) {
		return withEmployee(employee.getId());
	}

	@Override
	public List<Position> withEmployee(String employeeSurname) {
		for(Employee e: db.employees)
			if(e.getSurname().equals(employeeSurname))
				return e.getPositions();
		return new ArrayList<Position>();
	}

	@Override
	public List<Position> withEmployee(int employeeId) {
		for(Employee e: db.employees)
			if(e.getId()==employeeId)
				return e.getPositions();
		return new ArrayList<Position>();
				
	}

}
