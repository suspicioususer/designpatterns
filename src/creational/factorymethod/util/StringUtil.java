package creational.factorymethod.util;

public class StringUtil {

	public static boolean isEmpty(String value) {
		if (value == null || value.trim().length() == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isNotEmpty(String value) {
		return !isEmpty(value);
	}
	
	public static int getNumericValue(String value, int index) {
		return Character.getNumericValue(value.charAt(index));
	}

}
