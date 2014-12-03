package domain;

import java.util.*;

public class Employee extends Entity{
	
	public Employee(){
		positions = new ArrayList<Position>();
	}
	
	private String name;
	private String surname;
	
	private Company company;
	private List<Position> positions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}

	
}
