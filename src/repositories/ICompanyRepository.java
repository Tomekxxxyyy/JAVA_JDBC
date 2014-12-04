package repositories;

import java.util.List;
import domain.*;

public interface ICompanyRepository extends IRepository<Company>{
	
	public List<Company> withAddress(CompanyAddress address);
	public List<Company> withAddress(String addressStreet);
	public List<Company> withAddress(int addressId);
}
