package packages.mypackages2;

public class Address {
	private String streetName,pin;
	public Address(String streetName, String pin) {
		this.streetName = streetName;
		this.pin = pin;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
}
