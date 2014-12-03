package domain;

import java.util.*;

public class Salary extends Entity{
	
	public Salary()
	{
		positions = new ArrayList<Position>();
	}
	
	private String amount;
	
	private List<Position> positions;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}

	

}
