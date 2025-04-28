package test_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {
	
	/////////////////////
	//  VALID INPUTS  ///
	/////////////////////
	String VALID_ID = "12345";
	String MIN_VALID_ID = "1";
	String MAX_VALID_ID = "1234567890";
	String VALID_FIRST_NAME = "John";
	String MIN_VALID_FIRST_NAME = "A";
	String MAX_VALID_FIRST_NAME = "Abcdefghij";
	String VALID_LAST_NAME = "Doe";
	String MIN_VALID_LAST_NAME = "Z";
	String MAX_VALID_LAST_NAME = "Abcdefghij";
	String VALID_PHONE_NUMBER = "0987654321";
	String VALID_ADDRESS = "123Street";
	String MIN_VALID_ADDRESS = "S";
	String MAX_VALID_ADDRESS = "123456789012345678901234567890";
	
	
	///////////////
	/// Test ID ///
	///////////////
	
	@Test
	public void testId_withMinLengthValidId_IsSuccessful () {
		Contact testContact = new Contact(MIN_VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		Assertions.assertEquals(MIN_VALID_ID, testContact.getId());
	}
	
	
	@Test
	public void testId_withMaxLengthValidId_IsSuccessful () {
		Contact testContact = new Contact(MAX_VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		Assertions.assertEquals(MAX_VALID_ID, testContact.getId());
	}
	
	
	@Test
	public void testId_withNullvalue_throwIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(null, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS));
	}
	
	
	@Test
	public void testId_withMoreThanMoreThanMaxCharacters_throwsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS));
	}
	
	
	@Test
	public void testId_withEmptyString_throwsIllegalArgumentException () {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact("", VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS));
	}
	
	
	
	
	///////////////////////
	/// Test First Name ///
	///////////////////////
	
	@Test
	public void testFirstName_withMinLengthValidFirstName_IsSuccessful() {
		Contact testContact = new Contact(VALID_ID, MIN_VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		Assertions.assertEquals(MIN_VALID_FIRST_NAME, testContact.getFirstName());
	}
	
	@Test
	public void testFirstName_withMaxLengthValidFirstName_IsSuccessful() {
		Contact testContact = new Contact(VALID_ID, MAX_VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		Assertions.assertEquals(MAX_VALID_FIRST_NAME, testContact.getFirstName());
	}
	
	
	@Test
	public void testFirstName_withNullValue_throwsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, null, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS));
	}
	
	
	@Test
	public void testFirstName_withMoreThanMaxCharacters_throwsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, "itsjasonborne", VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS));
	}
	
	
	@Test
	public void testFirstName_withEmptyValue_throwsIllegalArgumentException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, "", VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS));
	}
	
	
	
	
	//////////////////////
	/// Test Last Name ///
	//////////////////////

	@Test
	public void testLastName_withMinLengthValidLastName_IsSuccessful() {
		Contact testContact = new Contact(VALID_ID, VALID_FIRST_NAME, MIN_VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
	Assertions.assertEquals(MIN_VALID_LAST_NAME, testContact.getLastName());
	}

	@Test
	public void testLastName_withMaxLengthValidLastName_IsSuccessful() {
	Contact testContact = new Contact(VALID_ID, VALID_FIRST_NAME, MAX_VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
	Assertions.assertEquals(MAX_VALID_LAST_NAME, testContact.getLastName());
	}


	@Test
	public void testLastName_withNullValue_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, null, VALID_PHONE_NUMBER, VALID_ADDRESS));
	}


	@Test
	public void testLastName_withMoreThanMaxCharacters_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, "itsjasonborne", VALID_PHONE_NUMBER, VALID_ADDRESS));
	}


	@Test
	public void testLastName_withEmptyValue_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, "", VALID_PHONE_NUMBER, VALID_ADDRESS));
	}
	
	
	
	
	/////////////////////////
	/// Test Phone Number ///
	/////////////////////////

	@Test
	public void testPhoneNumber_withValidNumber_IsSuccessful() {
		Contact testContact = new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
	Assertions.assertEquals(VALID_PHONE_NUMBER, testContact.getPhoneNumber());
	}


	@Test
	public void testPhoneNumber_withNullValue_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, null, VALID_ADDRESS));
	}


	@Test
	public void testPhoneNumber_withMoreThanMaxCharacters_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, "12345678901", VALID_ADDRESS));
	}
	
	
	@Test
	public void testPhoneNumber_withLessThanMaxCharacters_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, "123456789", VALID_ADDRESS));
	}


	@Test
	public void testPhoneNumber_withEmptyValue_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, "", VALID_ADDRESS));
	}
	
	
	
	
	////////////////////
	/// Test Address ///
	////////////////////

	@Test
	public void testAddress_withMinLengthAddress_IsSuccessful() {
		Contact testContact = new Contact(VALID_ID, VALID_FIRST_NAME, MIN_VALID_LAST_NAME, VALID_PHONE_NUMBER, MIN_VALID_ADDRESS);
	Assertions.assertEquals(MIN_VALID_ADDRESS, testContact.getAddress());
	}

	@Test
	public void testAddress_withMaxLengthValidAddress_IsSuccessful() {
	Contact testContact = new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, MAX_VALID_ADDRESS);
	Assertions.assertEquals(MAX_VALID_ADDRESS, testContact.getAddress());
	}


	@Test
	public void testAddress_withNullValue_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, null));
	}


	@Test
	public void testAddress_withMoreThanMaxCharacters_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, "1234567890123456789012345678901"));
	}


	@Test
	public void testAddress_withEmptyValue_throwsIllegalArgumentException() {
	Assertions.assertThrows(IllegalArgumentException.class, () -> new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, ""));
	}


}
