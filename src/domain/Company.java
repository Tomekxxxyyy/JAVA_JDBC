package domain;

import java.util.*;

public class Company extends Entity{
	
	public Company()
	{
		this.addresses=new ArrayList<CompanyAddress>();
	}
	
	private String name;
	private String legalStructure;
	private String companyId;
	
	private Employee employee;
	private List<CompanyAddress> addresses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLegalStructure() {
		return legalStructure;
	}
	public void setLegalStructure(String legalStructure) {
		this.legalStructure = legalStructure;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public List<CompanyAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<CompanyAddress> addresses) {
		this.addresses = addresses;
	}

}
