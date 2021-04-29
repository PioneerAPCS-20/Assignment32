import java.util.ArrayList;
import java.util.List;

public class Runner 
{
	public static void main(String[] args)
	{
		List<Double> sides = new ArrayList<Double>();
		sides.add(3.0);
		sides.add(4.5);
		sides.add(5.5);
		sides.add(4.75);
		
		// Quadrilateral
		Polygon p = new Quadrilateral(sides, 0.5236 , 0.4363);
		System.out.println(p + "\n");
		
		// Rectangle
		sides.set(0, 6.5);
		sides.set(1, 6.5);
		sides.set(2, 3.0);
		sides.set(3, 3.0);
		Polygon p1 = new Rectangle(sides);
		System.out.println(p1 + "\n");
		
		// Square
		sides.set(0, 10.2);
		sides.set(1, 10.2);
		sides.set(2, 10.2);
		sides.set(3, 10.2);
		Polygon p2 = new Rectangle(sides);
		System.out.println(p2 + "\n");
	}
}
