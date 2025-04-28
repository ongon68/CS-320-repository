package test_package;

public class Contact {
	
	final private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		this.id = id;
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
	}
	
	
	///ID exception throws
	private void setId(String id) {
		
		if (id == null) {
			throw new IllegalArgumentException("ID cannot be null");
		}
		else if (id.length() > 10) {
			throw new IllegalArgumentException("ID cannot be longer than 10 characters");
		}
		else if (id.isEmpty()) {
			throw new IllegalArgumentException("ID cannot be empty");
		}
	}
	
	public String getId() {
		return id;
	}
	
	
	
	////First name exception throws
	void setFirstName(String firstName) {
		
		if (firstName == null) {
			throw new IllegalArgumentException("First name cannot be null");
		}
		else if (firstName.length() > 10) {
			throw new IllegalArgumentException("First name cannot be longer than 10 characters");
		}
		else if (firstName.isEmpty()) {
			throw new IllegalArgumentException("First name cannot be empty");
		}
		
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	
	
	////Last name exception throws
	void setLastName(String lastName) {
		
		if (lastName == null) {
			throw new IllegalArgumentException("Last name cannot be null");
		}
		else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Last name cannot be longer than 10 characters");
		}
		else if (lastName.isEmpty()) {
			throw new IllegalArgumentException("Last name cannot be empty");
		}
		
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	
	////Phone number exception throws
	void setPhoneNumber(String phoneNumber) {
		
		if (phoneNumber == null) {
			throw new IllegalArgumentException("Phone number must be 10 characters");
		}
		else if (phoneNumber.length() > 10) {
			throw new IllegalArgumentException("Phone number must be 10 characters");
		}
		else if (phoneNumber.length() < 10) {
			throw new IllegalArgumentException("Phone number must be 10 characters");
		}
		else if (phoneNumber.isEmpty()) {
			throw new IllegalArgumentException("Phone number must be 10 characters");
		}
		
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	
	void setAddress(String address) {
		
		if (address == null) {
			throw new IllegalArgumentException("Address cannot be null");
		}
		else if (address.length() > 30) {
			throw new IllegalArgumentException("Address cannot be longer than 30 characters");
		}
		else if (address.isEmpty()) {
			throw new IllegalArgumentException("Address cannot be empty");
		}
		
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
}
