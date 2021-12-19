package edu.ualbany.Project_4;

public class Address {

	/**
	 * The street for this address.
	 */
	private String street;
	
	/**
	 * The city name for this address.
	 */
	private String city;
	
	/**
	 * The state name for this address.
	 */
	private String state;
	
	/**
	 * The zipcode for this address.
	 */
	private String zipcode;
	
	/**
	 * Default constructor for an empty Address object.
	 */
	public Address(){
		this.street = null;
		this.city = null;
		this.state = null;
		this.zipcode = null;
	}
	
	/**
	 * Constructs an Address object with a street, city, state and zipcode.
	 * @param street The street for this address.
	 * @param city The city for this address.
	 * @param state The state for this address.
	 * @param zipcode The zipcode for this address.
	 */
	public Address(String street, String city, String state, String zipcode){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	/**
	 * Returns the name of the street.
	 * @return The name of the street.
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Changes the name of the street.
	 * @param name The name of the street.
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Returns the name of this city.
	 * @return The name of the city.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Changes the name of the city.
	 * @param name The name of the city.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the name of this state.
	 * @return The name of the state.
	 */
	public String getState() {
		return state;
	}

	/**
	 * Changes the name of the state.
	 * @param name The name of the state.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Returns the number of this zip code.
	 * @return The number of the zip code.
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * Changes the number of the zip code.
	 * @param name The number of the zip code.
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
