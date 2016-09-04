
public class Instructor extends Person{
	
	private int salary;
	
	public Instructor(String name, int year, int salary)
	{
		super(name, year);
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Instructor[super=Person[name=" + this.name + ",birthYear=" + this.year + "],salary=" + (double)salary + "]";
	}
}
