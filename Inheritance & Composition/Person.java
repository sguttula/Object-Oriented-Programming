package lab5;

public class Person {
	private String name;
	private Address address; //q = Address
	

	public Person(String nameIn, int streetNumberIn, String streetNameIn, String city, String stateProvince, String country) {
		this.name = name;
		address = new Address(streetNumberIn, streetNameIn, city, stateProvince, country);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address.toString();
	}
	public String toString() {
		return (name + " resides at " + address.toString());
	}
}