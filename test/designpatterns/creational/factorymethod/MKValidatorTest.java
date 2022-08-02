package designpatterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import creational.factorymethod.validators.MKValidator;

class MKValidatorTest {
	
	private static MKValidator mkValidator;
	
	@BeforeAll
	static void init() {
		mkValidator = new MKValidator();
	}
	
	static Stream<String> emptyStrings() {
		return Stream.of(null, "", " ", "   ");
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "0101006450009" })
	void isValid_ShouldReturnTrueForValidIds(String value) {
		assertTrue(mkValidator.validate(value));
	}
			 
	@ParameterizedTest
	@MethodSource("emptyStrings")
	void isEmpty(String emptyValue) {
		assertFalse(mkValidator.validate(emptyValue));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "a", "b", "abc", "abcdefghijklm", "0", "-1", "1", "12", "123", "1234", "12345", 
			   				 "123456", "1234567", "12345678", "123456789", "1234567890", 
			   				 "12345678901", "123456789012", "1234567890123", "-1234567890", "-1234567890123",
			   				"-123456789012", "-0101006150005", "-12" })
	void isValid_ShouldReturnFalseForNonValidIds(String value) {
		assertFalse(mkValidator.validate(value));
	}
	

}
