package creational.factorymethod;

import java.text.MessageFormat;
import java.util.List;

import creational.factorymethod.factory.ValidatorFactory;
import creational.factorymethod.util.Country;
import creational.factorymethod.validators.Validator;

public class Main {
	
	public static void main(String[] args) {
		ValidatorFactory validatorFactory = new ValidatorFactory();
		
		Validator trValidator = validatorFactory.getValidator(Country.TURKIYE);
		List<String> idList = List.of("12345678950");
		idList.forEach(x -> {
			boolean valid = trValidator.validate(x);
			String message = MessageFormat.format("Id: {0} is not valid!", x);
			if (valid) {
				message = MessageFormat.format("Id: {0} is valid.", x);
			}
			System.out.println(message);
		});
		
		System.out.println();
		
		Validator baValidator = validatorFactory.getValidator(Country.BOSNIA_AND_HERZEGOVINA);
		idList = List.of("0101006150005");
		idList.forEach(x -> {
			boolean valid = baValidator.validate(x);
			String message = MessageFormat.format("Id: {0} is not valid!", x);
			if (valid) {
				message = MessageFormat.format("Id: {0} is valid.", x);
			}
			System.out.println(message);
		});
		
		
		System.out.println();
		
		Validator mkValidator = validatorFactory.getValidator(Country.MACEDONIA);
		idList = List.of("0101006450009");
		idList.forEach(x -> {
			boolean valid = mkValidator.validate(x);
			String message = MessageFormat.format("Id: {0} is not valid!", x);
			if (valid) {
				message = MessageFormat.format("Id: {0} is valid.", x);
			}
			System.out.println(message);
		});
	}

}
