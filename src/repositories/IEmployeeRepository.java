package repositories;

import java.util.List;
import domain.*;

public interface IEmployeeRepository extends IRepository<Employee>{
	
	public List<Employee> withPosition(Position position);
	public List<Employee> withPosition(String positionName);
	public List<Employee> withPosition(int PositionId);

}