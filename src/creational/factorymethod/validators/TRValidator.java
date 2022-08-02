package creational.factorymethod.validators;

import creational.factorymethod.util.Constants;
import creational.factorymethod.util.StringUtil;

public class TRValidator implements Validator {

	@Override
	public boolean validate(String identityNumber) {
		if (StringUtil.isEmpty(identityNumber) || !identityNumber.matches(Constants.NUMBER_REGEX)) {
			return false;
		}
		
		if (identityNumber.length() != 11 || identityNumber.startsWith("0")) {
			return false;
		}
		
		int oddSum = 0;
		int evenSum = 0;
		int tenthNumber = StringUtil.getNumericValue(identityNumber, 9);
		int eleventhNumber = StringUtil.getNumericValue(identityNumber, 10);
		for (int i = 0; i < identityNumber.length(); i++) {
			if (i <= 8) {
				int number = StringUtil.getNumericValue(identityNumber, i);
				if (i % 2 == 0) {
					evenSum += number;
				} else {
					oddSum += number;
				}
			}
		}
		
		int checkSum1 = (evenSum * 7 - oddSum) % 10;
		int checkSum2 = (evenSum + oddSum + checkSum1) % 10;
		
		if (checkSum1 != tenthNumber && checkSum2 != eleventhNumber) {
			return false;
		}
		
		return true;
	}

}
