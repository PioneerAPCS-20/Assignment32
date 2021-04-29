
public class Car extends Vehicle 
{
	
	public Car(int numWheels, String make) 
	{
		super(numWheels, make);
	}
	
	public Car(String make)
	{
		super(4, make);
	}
	
	public void putDownWindow()
	{
		// put down window
	}
	
	@Override
	public String toString()
	{
		return "Car: " + getMake();
	}
}
