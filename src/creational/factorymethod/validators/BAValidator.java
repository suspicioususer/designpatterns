package creational.factorymethod.validators;

import java.util.function.Function;

// Validator for Bosnia and Herzegovina
public class BAValidator extends YUValidator {

	@Override
	public boolean validate(String identityNumber) {
		Function<Integer, Boolean> regionControlFunction = x -> x == 1 || (x >= 10 && x <= 19);
		setRegionControlFunction(regionControlFunction);
		return super.validate(identityNumber);
	}

}
