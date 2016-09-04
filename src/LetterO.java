/**
 * class to make letter O
 * @author brettnelson
 *
 */
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;

public class LetterO {

	private int topLeftX, topLeftY;
	private int height, width;
	
	public LetterO(Point2D.Double topLeft, int height, int width)
	{
		topLeftX = (int)topLeft.x;
		topLeftY = (int)topLeft.y;
		this.height = height;
		this.width = width;
	}
	
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double circ = new Ellipse2D.Double(topLeftX, topLeftY, width/5, height/4);
		g2.draw(circ);
	}
	
}
