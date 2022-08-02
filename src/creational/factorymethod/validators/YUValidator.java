package creational.factorymethod.validators;

import java.util.function.Function;

import creational.factorymethod.util.Constants;
import creational.factorymethod.util.DateUtil;
import creational.factorymethod.util.StringUtil;

// Validator for Yugoslavia
public abstract class YUValidator implements Validator {
	
	private Function<Integer, Boolean> regionControlFunction;
	
	@Override
	public boolean validate(String identityNumber) {
		if (StringUtil.isEmpty(identityNumber) || !identityNumber.matches(Constants.NUMBER_REGEX)) {
			return false;
		}

		if (identityNumber.length() != 13) {
			return false;
		}

		String day = identityNumber.substring(0, 2);
		String month = identityNumber.substring(2, 4);
		String year = identityNumber.substring(4, 7);
		int region = Integer.parseInt(identityNumber.substring(7, 9));
		int lastNumber = Integer.parseInt(identityNumber.substring(identityNumber.length() - 1));

		if (!DateUtil.isValidDate(day, month, year)) {
			return false;
		}
		
		if (!regionControlFunction.apply(region)) {
			return false;
		}

		int checkSum = 0;
		int cycle = 6;
		for (int i = 0; i < cycle; i++) {
			int number = (2 + i) * (StringUtil.getNumericValue(identityNumber, (cycle - 1) - i) + StringUtil.getNumericValue(identityNumber, ((cycle * 2 ) - 1) - i)); 
			checkSum += number;
		}
		
		checkSum = 11 - (checkSum % 11);
		if (checkSum >= 10) {
			checkSum = 0;
		}

		if (checkSum != lastNumber) {
			return false;
		}

		return true;
	}
	
	public void setRegionControlFunction(Function<Integer, Boolean> regionControlFunction) {
		this.regionControlFunction = regionControlFunction;
	}

}
