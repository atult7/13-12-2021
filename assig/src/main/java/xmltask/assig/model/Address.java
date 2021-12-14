package xmltask.assig.model;

public class Address {
	
	String street;
	String zip;
public Address() {}	
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public Address(String street, String zip) {
	super();
	this.street = street;
	this.zip = zip;
}

}
