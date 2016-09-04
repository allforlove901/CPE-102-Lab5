import javax.swing.JComponent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

/**
 * component that displays letters
 * @author brettnelson
 *
 */
public class LettersComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		LetterH letH = new LetterH(new Point2D.Double(5,0), getWidth(), getHeight());
		LetterE letE = new LetterE(new Point2D.Double(getWidth()*1/5,0), getWidth(), getHeight());
		LetterL letL = new LetterL(new Point2D.Double(getWidth()*2/5,0), getWidth(), getHeight());
		LetterL letL2 = new LetterL(new Point2D.Double(getWidth()*3/5,0), getWidth(), getHeight());
		LetterO letO = new LetterO(new Point2D.Double(getWidth()*4/5,0), getWidth(), getHeight());
		
		LetterH letH2 = new LetterH(new Point2D.Double(5,getHeight()*1/2), getWidth(), getHeight());
		LetterE letE2 = new LetterE(new Point2D.Double(getWidth()*3/5,getHeight()*1/2), getWidth(), getHeight());
		LetterL letL3 = new LetterL(new Point2D.Double(getWidth()*2/5,getHeight()*1/2), getWidth(), getHeight());
		LetterO letO2 = new LetterO(new Point2D.Double(getWidth()*1/5,getHeight()*1/2), getWidth(), getHeight());
		
		letH.draw(g2);
		letE.draw(g2);
		letL.draw(g2);
		letL2.draw(g2);
		letO.draw(g2);
		
		letH2.draw(g2);
		letE2.draw(g2);
		letL3.draw(g2);
		letO2.draw(g2);
	}
}
