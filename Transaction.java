import java.util.*;

public class Transaction{
	
	final static int DAYS = 30;
	final static int MONTHs = 12;
	
	private Customer customer;
	private Car car;
	
	private int age = 0;
	private String month; //Current month
	private String day; //Current date
	private String pickMonth;
	//private int pickMonth;
	private int pickDate;
	private int pickYear;
	private String returnMonth;
	private int returnDate;
	private int returnYear;
	private String birthMonth;
	private int birthDate;
	private int birthYear;
	
	public void Transaction() {
		
	}
	
	public void Transaction(Customer cU, Car cA, String m, String d, String pM, int pD, int pY, String rM, int rD, int rY, String bM, int bD, int bY) { //constructor
		this.customer = cU;
		this.car = cA;
		this.month = m;
		this.day = d;
		this.pickMonth = pM;
		this.pickDate = pD;
		this.pickYear = pY;
		this.returnMonth = rM;
		this.returnDate = rD;
		this.returnYear = rY;
		this.birthMonth = bM;
		this.birthDate = bD;
		this.birthYear = bY;
	}
	
	public Customer getCustomer() {
		
		return customer;
	}
	
	public Car getCar() {
		
		return car;
	}
	
	public String getMonth() {
		
		return this.month;
	}
	
	public String getDay(){
		
		return this.day;
	}
	
	public String getPickMonth() {
		
		return this.pickMonth;
	}
	
	public int getPickDate() {
		
		return this.pickDate;
	}
	
	public int getPickYear() {
		
		return this.pickYear;
	}
	
	public String getReturnMonth() {
		
		return this.returnMonth;
	}
	
	public int getReturnDay() {
		
		return this.returnDate;
	}
	
	public int getReturnYear() {
		
		return this.returnYear;
	}
	
	public String getBirthMonth() {
		
		return this.birthMonth;
	}
	
	public int getBirthDay() {
		
		return this.birthDate;
	}
	
	public int getBirthYear() {
		
		return this.birthYear;
	}
	
	
	
	
}