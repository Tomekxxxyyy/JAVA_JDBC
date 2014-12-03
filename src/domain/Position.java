package domain;

import java.util.*;

public class Position extends Entity{
	
	public Position()
	{
		salaries = new ArrayList<Salary>();
		employees = new ArrayList<Employee>();
	}
	
	private String name;
	
	private List<Salary> salaries;
	private List<Employee> employees;
	
	

	
}
