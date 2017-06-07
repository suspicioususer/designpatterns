package creational.abstractfactory;

import creational.abstractfactory.factories.AbstractFactory;
import creational.abstractfactory.factories.BankFactory;
import creational.abstractfactory.factories.LoanFactory;

class FactoryCreator {
	
	public static AbstractFactory getFactory(String choice) {
		
		if (choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		} else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
}