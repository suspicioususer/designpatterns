package creational.builder.example1;

import creational.builder.example1.companies.Samsung;
import creational.builder.example1.companies.Sony;

public class CDBuilder {
	
	public CDType buildSonyCD() {
		CDType cds = new CDType();
		cds.addItem(new Sony());
		return cds;
	}

	public CDType buildSamsungCD() {
		CDType cds = new CDType();
		cds.addItem(new Samsung());
		return cds;
	}
}
