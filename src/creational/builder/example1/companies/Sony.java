package creational.builder.example1.companies;

import creational.builder.example1.Company;

public class Sony extends Company {
	
	@Override
	public int price() {
		return 20;
	}

	@Override
	public String pack() {
		return "Sony CD";
	}
}