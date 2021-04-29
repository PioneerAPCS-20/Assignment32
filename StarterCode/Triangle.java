
/*
 * Triangle class
 * 
 * Subclass of Polygon
 * Invokes constructor in superclass (Polygon)
 * Overrides getArea() method in superclass (Polygon)
 */

import java.util.List;

public class Triangle extends Polygon
{	
	/**
	 * 
	 * @param sides: {base, leg, leg}
	 */
	public Triangle(List<Double> sides)
	{
		super(sides);
	}

	@Override
	public double getArea() 
	{	
		double a = getSides().get(0);
		double b = getSides().get(1);
		double c = getSides().get(2);
		
		double s = (a + b + c) / 2;
		
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
