
public class Car implements IVehicle{

	int speed ;
	
	//Acceleration and Brake are classes which are derived from IVehicle
	
	public void Acceleration(int incrementedSpeed) {
		speed = speed + incrementedSpeed;
		
	}

	public void Brake(int decreasedSpeed) {
		speed = speed - decreasedSpeed;
	}
	
	
	// add this class to show current speed and we use this class in main class 
	public void displaySpeed(){
		System.out.println( speed);
	}

}
