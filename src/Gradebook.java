/**
 * class to implement gradebook objects
 */
import java.util.ArrayList;

public class Gradebook {

	private ArrayList<Student> students = new ArrayList<Student>();
	
	public void trackStudent(Student kid)
	{
		students.add(kid);
	}
}
