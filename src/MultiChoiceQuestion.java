import java.util.ArrayList;

/**
 * class to implement multiChoice questions
 * @author brettnelson
 *
 */
public class ChoiceQuestion extends Question {

	private String question;
	private double answer;
	private ArrayList<String> answers = new ArrayList<String>();
	private ArrayList<Boolean> answerOutputs = new ArrayList<Boolean>();

	
	public ChoiceQuestion(String question)
	{
		super(question);
		this.question = question;
	}
	
	public void addChoice(String choiceName, boolean output)
	{
		answers.add(choiceName);
		answerOutputs.add(output);
	}
	
	public boolean checkAnswer(String response)
	{
		String numbers = response.trim();
		String[] numbers2 = numbers.split(" ");
		
		int[] numbers3 = new int[numbers2.length];
		for(int i = 0; i < numbers2.length; i++)
			numbers3[i] = Integer.parseInt(numbers2[i]);
		
		for(int number:numbers3)
		{
			if(!answerOutputs.get(number-1))
				return false;
		}
		return true;
	}
	
	public void display()
	   {
	      System.out.println(question);
	      for(String ans: answers)
	      {
	  		System.out.println((answers.indexOf(ans) + 1) + ": " + ans);
	      }
	   }
	
	public String toString()
	   {
		   String output = "ChoiceQuestion[test=" + question + ",answer=2" + "]";
		   output += "[choices=" + answers + "]"; 
		   return output;
		   //Expected: ChoiceQuestion[text=In which country was the inventor of Java born?,
				   //answer=2][choices=[Australia, Canada, Denmark, United States]]
	   }
}
