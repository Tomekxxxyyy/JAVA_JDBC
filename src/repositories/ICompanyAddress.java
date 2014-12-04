package repositories;

import java.util.List;
import domain.*;

public interface ICompanyAddress extends IRepository<CompanyAddress>{
	
	public List<CompanyAddress> withCompany(Company company);
	public List<CompanyAddress> withCompany(String companyName);
	public List<CompanyAddress> withCompany(int addressId);
}
