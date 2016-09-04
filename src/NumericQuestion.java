/**
 * class to implement numeric questions
 * @author brettnelson
 *
 */
public class NumericQuestion extends Question {

	private String question;
	private double answer;
	
	public NumericQuestion(String question)
	{
		super(question);
		this.question = question;
	}
	
	public void setAnswer(double answer)
	{
		this.answer = super.answer;
	}
	
	public boolean checkAnswer(double response)
	{
		if(Math.abs(response - answer) <= 0.01)
			return true;
		else
			return false;
	}
}
