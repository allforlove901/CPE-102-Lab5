import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Geometry {

	/**
	 * a class to see if a point lies within an ellipse
	 * @param p a point
	 * @param e an ellipse
	 * @return
	 */
	public static boolean isInside(Point2D.Double p, Ellipse2D.Double e)
	{
		if (p.x > e.getCenterX()-1/2*e.width && p.x < e.getCenterX()+1/2*e.width)
		{
			if(p.y > e.getCenterY()-1/2*e.height && p.y < e.getCenterY()+1/2*e.height)
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	
	/**
	 * a class to tell whether a point lies on an ellipse boundary
	 * @param p a point
	 * @param e an ellipse
	 * @return
	 */
	public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e)
	{
		double xValue, yValue;
		xValue = Math.pow((p.x - e.getCenterX()), 2)/(e.width*e.width*.25);
		yValue = Math.pow((p.y - e.getCenterY()), 2)/(e.height*e.height*.25);
		if (Math.abs(xValue + yValue - 1) < .01)
			return true;
		else
			return false;
	}
}
