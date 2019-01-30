import java.awt.print.Printable;


public class Main {

	public static void main(String[] args) {
	
		//Create car object from Car class
		Car car = new Car();
		
		
		System.out.print("Accelerated speed is :");
		
		//call Acceleration from Car Class  
		
		car.Acceleration(120);
		car.displaySpeed();
		
	
		
		
		System.out.print("Breaked speed is :");
			
		//call Brake method form Car Class
		
		car.Brake(20);
		car.displaySpeed();
		
		
	}

}
