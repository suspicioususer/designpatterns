package creational.factorymethod.util;

public class DateUtil {

	public static boolean isValidDate(String day, String month, String year) {
		try {
			int a = Integer.parseInt(day);
			if (a < 1 || a > 31) {
				return false;
			}
			
			int b = Integer.parseInt(month);
			if (b < 1 || b > 12) {
				return false;
			}
			
			int c = Integer.parseInt(year);
			if (c >= 900) {
				c += 1000; // 1900+
			} else {
				c += 2000; // 2000+
			}
			
			if (b == 2) { // february control
				if (a > 29) {
					return false;
				} else if (a == 29) {
					boolean case1 = c % 4 == 0 && c % 100 != 0;
					boolean case2 = c % 400 == 0;
					if (!case1 && !case2) { // leap year control
						return false;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
