package repositories;

import java.util.List;
import domain.*;

public interface ICompanyRepository extends IRepository<Company>{
	
	public Company withAddress(CompanyAddress address);
	public Company withAddress(String addressStreet);
	public Company withAddress(int companyId);
}
