
public class Student extends Person{
	
	private String major;
	
	public Student(String name, int year, String major)
	{
		super(name, year);
		this.major = major;
	}
	
	public String toString()
	{
		return "Student[super=Person[name=" + this.name + ",birthYear=" + this.year + "],major=" + major + "]";
	}
}
