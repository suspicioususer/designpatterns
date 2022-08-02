package creational.factorymethod.factory;

import creational.factorymethod.util.Country;
import creational.factorymethod.validators.BAValidator;
import creational.factorymethod.validators.MKValidator;
import creational.factorymethod.validators.TRValidator;
import creational.factorymethod.validators.Validator;

public class ValidatorFactory {

	public Validator getValidator(Country country) {
		if (country == null) {
			return getEmptyValidator();
		}

		switch (country) {
		case TURKIYE:
			return new TRValidator();
		case BOSNIA_AND_HERZEGOVINA:
			return new BAValidator();
		case MACEDONIA:
			return new MKValidator();
		default:
			break;
		}
		return getEmptyValidator();
	}

	private Validator getEmptyValidator() {
		return new Validator() {
			@Override
			public boolean validate(String identityNumber) {
				return false;
			}
		};
	}

}
