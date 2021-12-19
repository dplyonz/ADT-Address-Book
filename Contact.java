package edu.ualbany.Project_4;

public class Contact implements Comparable<Contact> {
	
	/**
	 * The name of this contact.
	 */
	private String firstname;
	
	/**
	 * The last name of this contact
	 */
	private String lastname;
	
	/**
	 * The address information of this contact.
	 */
	private Address address;
	
	/**
	 * The phone number for this contact.
	 */
	private String phonenumber;
	
	/**
	 * Default constructor for an empty Contact object.
	 */
	public Contact(){
		this.firstname = null;
		this.lastname = null;
		this.address = null;
		this.phonenumber = null;
	}
	
	/**
	 * Constructs a Contact object with a name, address and phone number.
	 * @param name The name for this contact.
	 * @param address The address for this contact.
	 * @param phonenumber The phone number for this contact.
	 */
	public Contact(String firstname, String lastname, Address address, String phonenumber){
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phonenumber = phonenumber;
	}

	/**
	 * Returns the first name of this contact.
	 * @return The first name of the contact.
	 */
	public String getFirstName() {
		return this.firstname;
	}
	
	/**
	 * Returns the last name of this contact.
	 * @return The last name of the contact.
	 */
	public String getLastName() {
		return this.lastname;
	}

	/**
	 * Changes the first and last name of this contact.
	 * @param name The name of this contact.
	 */
	public void setName(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	/**
	 * Returns the address of this contact.
	 * @return The address of the contact.
	 */
	public Address getAddress() {
		return this.address;
	}

	/**
	 * Changes the address of this contact.
	 * @param name The address of this contact.
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Returns the phone number of this contact.
	 * @return The phone number of this contact.
	 */
	public String getPhonenumber() {
		return this.phonenumber;
	}

	/**
	 * Changes the phone number of this contact.
	 * @param name The phone number of this contact.
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public int compareTo(Contact contact){
		return ((this.getFirstName()+this.getLastName()).compareTo(contact.getFirstName()+contact.getLastName()));
	}
	
}
