package test_package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	final String VALID_ID = "12345";
	final String VALID_FIRST_NAME = "John";
	final String VALID_LAST_NAME = "Doe";
	final String VALID_PHONE_NUMBER = "0987654321";
	final String VALID_ADDRESS = "123Street";
	
	final String UPDATE_VALID_ID = "12345";
	final String UPDATE_VALID_FIRST_NAME = "Bob";
	final String UPDATE_VALID_LAST_NAME = "Ryan";
	final String UPDATE_VALID_PHONE_NUMBER = "1234567890";
	final String UPDATE_VALID_ADDRESS = "456Ave";
	
	private ContactService service;
	
	@BeforeEach
	public void setUp() {
		service = new ContactService();
	}
	
	///////////
	/// ADD ///
	///////////
	
	@Test
	public void testAdd_withNewContact_successfullyAdds () {
		Contact newContact = new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		service.add(newContact);
		Assertions.assertEquals(service.get(newContact.getId()), newContact);
	}
	
	@Test
	public void testAdd_withDuplicate_throwsIllegalArgumentException() {
		Contact newContact = new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		service.add(newContact);
		Assertions.assertNotNull(service.get(newContact.getId())); 
		
		///IllegalArgumentException when trying to add Contact with same ID
		Assertions.assertThrows(IllegalArgumentException.class, () -> service.add(newContact));
	}
	
	
	
	//////////////
	/// REMOVE ///
	//////////////
	
	@Test
	public void testRemove_withNewContact_successfullyRemoves () {
		Contact newContact = new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		service.add(newContact);
		service.remove(newContact);
		Assertions.assertNull(service.get(newContact.getId()));
	}
	
	
	
	//////////////
	/// UDPATE ///
	//////////////
	
	@Test
	public void testUpdate_contactInfo_successfullyUpdates () {
		Contact newContact = new Contact(VALID_ID, VALID_FIRST_NAME, VALID_LAST_NAME, VALID_PHONE_NUMBER, VALID_ADDRESS);
		service.add(newContact);
		service.update(VALID_ID, UPDATE_VALID_FIRST_NAME, UPDATE_VALID_LAST_NAME, UPDATE_VALID_PHONE_NUMBER, UPDATE_VALID_ADDRESS);
		Assertions.assertEquals(service.get(newContact.getId()), newContact);
	}
	
}
