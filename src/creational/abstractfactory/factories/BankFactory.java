package creational.abstractfactory.factories;

import creational.abstractfactory.banks.Bank;
import creational.abstractfactory.banks.HDFC;
import creational.abstractfactory.banks.ICICI;
import creational.abstractfactory.banks.SBI;
import creational.abstractfactory.loans.Loan;

public class BankFactory extends AbstractFactory {
	
	public Loan getLoan(String loan) {
		return null;
	}
	
	public Bank getBank(String bank) {
		
		if (bank == null) {
			return null;
		}
		
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		return null;
	}
}