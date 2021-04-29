
public class Triangle extends Polygon
{	
	/**
	 * 
	 * @param sides: {base, leg, leg}
	 */
	public Triangle(double[] sides)
	{
		super(sides);
	}

	@Override
	public double getArea() 
	{	
		double a = getSides()[0];
		double b = getSides()[1];
		double c = getSides()[2];
		
		double s = (a + b + c) / 2;
		
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
