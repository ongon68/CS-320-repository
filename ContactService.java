package test_package;


import java.util.ArrayList;
import java.util.List;

public class ContactService {
	
	private List<Contact> contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}

	public void add(Contact newContact) {
		boolean isDuplicate = false;
		boolean isNull = false;
		
		for (Contact contact : contacts) {
			if (contact.getId().equals(newContact.getId())) {
				isDuplicate = true;
				break;
			}
		}
		for (Contact contact : contacts) {
			if (contact.getId() == null) {
				isNull = true;
				break;
			}
		}
		
		if (isDuplicate) {
			throw new IllegalArgumentException("Cannot add contact with duplicate id: " + newContact.getId());
		}
		if (isNull) {
			throw new IllegalArgumentException("Cannot add contact with null id.");
		}
		
		contacts.add(newContact);
	}

	public Contact get(String id) {
		
		Contact foundContact = null;
		
		for (Contact contact: contacts) {
			if (contact.getId().equals(id)) {
				foundContact = contact;
				break;
			}
		}
		return foundContact;
	}

	public void remove(Contact newContact) {
		boolean isNull = false;
		
		for (Contact contact : contacts) {
			if (contact.getId().equals(null)) {
				isNull = true;
				break;
			}
		}
		
		if (isNull) {
			throw new IllegalArgumentException("Cannot add contact with null id.");
		}
		
		contacts.remove(newContact);
	}

	public void update(String VALID_ID, String UPDATE_VALID_FIRST_NAME, String UPDATE_VALID_LAST_NAME, String UPDATE_VALID_PHONE_NUMBER, String UPDATE_VALID_ADDRESS) {
		for (Contact contact: contacts) {
			if (contact.getId().equals(VALID_ID)) {
				contact.setFirstName(UPDATE_VALID_FIRST_NAME);
				contact.setLastName(UPDATE_VALID_LAST_NAME);
				contact.setPhoneNumber(UPDATE_VALID_PHONE_NUMBER);
				contact.setAddress(UPDATE_VALID_ADDRESS);
			}
		}
		
	}
	

	

}
