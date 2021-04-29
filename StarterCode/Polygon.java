import java.util.List;
import java.util.ArrayList;

public class Polygon 
{
	private List<Double> sides;
	
	/**
	 * 
	 * @param sides of polygon
	 */
	public Polygon(List<Double> sides)
	{
		this.sides = new ArrayList<Double>(sides);
	}
	
	/**
	 * name: getPerimeter
	 * return type: double
	 * @return perimeter of this Polygon
	 */
	
	
	
	
	
	
		
	/**
	 * name: getNumVertices
	 * return type: int
	 * @return number of vertices (corners) this Polygon has
	 */
	
	
	
	
	
	
	/**
	 * name: getNumSides
	 * return type: int
	 * @return number of sides this Polygon has
	 */

	
	
	
	
	
	
	/**
	 * name: getSumOfAngles
	 * return type: int
	 * @return sum of all angles ( (num_sides - 2) * 180)
	 */

	
	
	public double getArea()
	{
		return 0.0;
	}
	
	
	
	/**
	 * 
	 * @return copy of sides array
	 */
	public List<Double> getSides()
	{
		return new ArrayList<Double>(sides);
	}
	
	/**
	 * Override toString method in Object class.
	 */
	@Override
	public String toString()
	{
		String str = "";
		List<Double> s = new ArrayList<Double>(getSides());
		
		if(getNumSides() == 3)
			str += "Triangle";
		
		else if(getNumSides() == 4 && s.get(0).equals(s.get(1)) && s.get(0).equals(s.get(2)) && s.get(0).equals(s.get(3)))
			str += "Square";
		
		else if(getNumSides() == 4 && s.get(0).equals(s.get(1)) && s.get(2).equals(s.get(3)))
			str += "Rectangle";
		
		else if(getNumSides() == 4)
			str += "Quadrilateral";
		
		else
			str += "Polygon";
		
		double area = getArea();
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		
		str += "\nArea = " + df.format(area) + "\nPerimeter = " + getPerimeter() +
				"\nNumber of sides: " + getNumSides() + "\nSum of angles: " + getSumOfAngles();
		
		return str;
	}
}
