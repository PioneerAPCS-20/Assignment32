
public class Vehicle 
{
	private int numWheels;
	private String make;
	private boolean running;
	
	public Vehicle(int numWheels, String make)
	{
		this.numWheels = numWheels;
		this.make = make;
		this.running = false;
	}
	
	public int getNumWheels()
	{
		return numWheels;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public boolean isRunning()
	{
		return running;
	}
	
	public void turnOn()
	{
		running = true;
	}
	
	public void turnOff()
	{
		running = false;
	}
	
	public void doBurnout()
	{
		// do burnout
	}
}
