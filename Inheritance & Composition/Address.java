package lab5;

public class Address {
	protected int streetNumber;
	protected String streetName;
	protected String city;
	protected String stateProvince;
	protected String country;
	
public Address(int streetNumber, String streetName, String city, String stateProvince, String country) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.stateProvince = stateProvince;
		this.country = country;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return streetNumber + " " + streetName + " " + city + " " + stateProvince + " " + country; 
	}
}