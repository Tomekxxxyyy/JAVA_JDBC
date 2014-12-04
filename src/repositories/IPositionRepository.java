package repositories;

import java.util.List;
import domain.*;

public interface IPositionRepository extends IRepository<Position>{
			
	public List<Position>withEmployee(Employee employee);
	public List<Position>withEmployee(String employeeSurname);
	public List<Position>withEmployee(int employeeId);
}