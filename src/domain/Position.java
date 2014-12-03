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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Salary> getSalaries() {
		return salaries;
	}
	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	

	
}
