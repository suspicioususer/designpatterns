package designpatterns.creational.factorymethod;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import creational.factorymethod.validators.TRValidator;

class TRValidatorTest {
	
	private static TRValidator trValidator;
	
	@BeforeAll
	static void init() {
		trValidator = new TRValidator();
	}
	
	static Stream<String> emptyStrings() {
		return Stream.of(null, "", " ", "   ");
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "12345678950" })
	void isValid_ShouldReturnTrueForValidIds(String value) {
		assertTrue(trValidator.validate(value));
	}
			 
	@ParameterizedTest
	@MethodSource("emptyStrings")
	void isEmpty(String emptyValue) {
		assertFalse(trValidator.validate(emptyValue));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "a", "b", "abc", "abcdefghijk", "0", "-1", "1", "12", "123", "1234", "12345", 
			   				 "123456", "1234567", "12345678", "123456789", "1234567890", 
			   				 "12345678901", "123456789012", "-1234567890", "-12345678901",
			   				 "-12345678950", "-12", "01234567840"})
	void isValid_ShouldReturnFalseForNonValidIds(String value) {
		assertFalse(trValidator.validate(value));
	}
	

}
