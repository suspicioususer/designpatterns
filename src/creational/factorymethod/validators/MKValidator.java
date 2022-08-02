package creational.factorymethod.validators;

import java.util.function.Function;

// Validator for Macedonia
public class MKValidator extends YUValidator {

	@Override
	public boolean validate(String identityNumber) {
		Function<Integer, Boolean> regionControlFunction = x -> x == 4 || (x >= 41 && x <= 49);
		setRegionControlFunction(regionControlFunction);
		return super.validate(identityNumber);
	}

}
