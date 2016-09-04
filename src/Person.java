/**
 * creates a person
 * @author brettnelson
 *
 */
public class Person {

	protected String name;
	protected int year;
	
	public Person(String name, int yearOfBirth)
	{
		this.name = name;
		year = yearOfBirth;
	}
	
	public String toString()
	{
		return "Person[name=" + name + ",birthYear=" + year + "]";
	}
	
}
