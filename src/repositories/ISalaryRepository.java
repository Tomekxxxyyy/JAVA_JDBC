package repositories;

import java.util.List;
import domain.*;

public interface ISalaryRepository extends IRepository<Salary>{
	
	public List<Salary> withPosition(Position position);
	public List<Salary> withPosition(String positionName);
	public List<Salary> withPosition(int positionId);
}

