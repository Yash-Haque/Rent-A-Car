import java.util.*;

public class Car {
	private String carType;
	private String carModel;
	private double carPrice;
	
	public void Car() {
		
	}
	
	public void Car(double cP, String cM, String cT) {
		this.carPrice = cP;
		this.carModel = cM;
		this.carType = cT;
	}
	
	public String getCarType(){
		
		return this.carType;
	}
	
	public String getCarModel() {
		
		return this.carModel;
	}
	
	public double getCarPrice() {
		
		return this.carPrice;
	}
	
	//Returns Basic Car Info
	public String toString() {
		
		return getCarType() + "-" + getCarModel();
	}
}
