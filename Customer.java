
public class Customer {
	private String firstName;
	private String lastName;
	private String gender;
	private String address;
	private String contacts;
	private String status;
	
	public void Customer() {
		
	}
	
	public void Customer(String fN, String lN, String g, String s, String add, String c, String st) {
		this.firstName = fN;
		this.lastName = lN;
		this.gender = g;
		this.address = add;
		this.contacts = c;
		this.status = st;
	
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	public String getGender() {
		
		return this.gender;
	}
	
	public String getAddress() {
		
		return this.address;
	}
	
	public String getContact() {
		
		return this.contacts;
	}
	
	public String getStatus() {
		
		return this.status;
	}
	
	//Returns Full Name
	public String toString() {
		
		return getFirstName() + " " + getLastName();
	}
}
