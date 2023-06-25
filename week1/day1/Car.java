package week1.day1;

public class Car {
	public void driveCar(){
	System.out.println("Drive the car cautiously");	
	}
	public void applyBrake(){
	System.out.println("Apply brake as & when required");
	}
	public void soundHorn(){
	System.out.println("Blow Horn when some human entity crosses your path");
	}
	public void isPuncture(){
	System.out.println("Check the tyre for puncture before you start driving");
	}

	public static void main(String[] args) {
	System.out.println("Car class");
	Car c = new Car();
	c.driveCar();
	c.applyBrake();
	c.soundHorn();
	c.isPuncture();
	}
}
