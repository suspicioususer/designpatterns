package creational.builder.example1.companies;

import creational.builder.example1.Company;

public class Samsung extends Company {
	
	@Override
	public int price() {
		return 15;
	}

	@Override
	public String pack() {
		return "Samsung CD";
	}
}