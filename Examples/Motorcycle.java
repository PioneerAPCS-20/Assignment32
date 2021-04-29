
public class Motorcycle extends Vehicle 
{
	public Motorcycle(int numWheels, String make) 
	{
		super(numWheels, make);
	}

	public Motorcycle(String make)
	{
		super(2, make);
	}
	
	public void popWheelie()
	{
		// do wheelie
	}
}
