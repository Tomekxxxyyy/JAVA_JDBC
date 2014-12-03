package domain;

import java.util.*;

public class Salary extends Entity{
	
	public Salary()
	{
		positions = new ArrayList<Position>();
	}
	
	private int amount;
	
	private List<Position> positions;

	

}
