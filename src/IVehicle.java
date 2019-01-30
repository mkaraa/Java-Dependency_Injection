
//This is an interface class and other classes which are implemented by IVehicle have to use this class 
//Put "I" (means interface) in head of the class name because if you are working with a team, others can easily understand 

public interface IVehicle {
	
	void Acceleration(	int speed  );
	
	void Brake ( int speed );
	
}
