/**
 * class to make letter O
 * @author brettnelson
 *
 */
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;

public class LetterH {

	private int topLeftX, topLeftY;
	private int height, width;
	
	public LetterH(Point2D.Double topLeft, int height, int width)
	{
		topLeftX = (int)topLeft.x;
		topLeftY = (int)topLeft.y;
		this.height = height;
		this.width = width;
	}
	
	public void draw(Graphics2D g2)
	{
		Line2D.Double line1 = new Line2D.Double(topLeftX, topLeftY, topLeftX, topLeftY+height/4);
		Line2D.Double line2 = new Line2D.Double(topLeftX + width/5, topLeftY, topLeftX + width/5, topLeftY+height/4);
		Line2D.Double line3 = new Line2D.Double(topLeftX, topLeftY+height/8, topLeftX+width/5, topLeftY+height/8);
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
	}
	
}
