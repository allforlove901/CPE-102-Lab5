/**
 * creates an employee
 * @author brettnelson
 *
 */

public class Employee {

	private String name;
	private int salary;
	
	public Employee(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Employee[name=" + name + ",salary=" + (double)salary + "]";
	}
}
