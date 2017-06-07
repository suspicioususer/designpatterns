package creational.abstractfactory.factories;

import creational.abstractfactory.banks.Bank;
import creational.abstractfactory.loans.Loan;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}