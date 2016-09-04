import java.util.Scanner;

public class Input {

	/**
	 * class to see whether an int is between two ints
	 * @param in a scanner
	 * @param prompt a string
	 * @param error an error
	 * @param min an int
	 * @param max an int
	 * @return
	 */
	public static int readInt(Scanner in, String prompt, String error, int min, int max)
	{
		Scanner scn = in;
		System.out.println(prompt);
		while(scn.hasNextInt())
		{
			int age = scn.nextInt();
			if (age > min && age < max)
				return age;
			else
			{
				System.out.println(error);
				System.out.println(prompt);
			}
		}
		return 0;
	}
	
}
