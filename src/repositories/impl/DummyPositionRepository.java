package repositories.impl;

import java.util.List;

import repositories.IRepository;
import domain.Position;

public class DummyPositionRepository implements IRepository<Position> {

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
		for(Position position : db.positions)
			if(position.getId()==id)
				return position;
		return null;
		
	}

	@Override
	public List<Position> getAll() {
		return db.positions;
	}

}
