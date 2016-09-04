/**
 * creates a manager
 * @author brettnelson
 *
 */
public class Manager extends Employee{

	private String department;
	
	public Manager(String name, int salary, String department)
	{
		super(name, salary);
		this.department = department;
	}
	
	public String toString()
	{
		return "Manager[super=" + super.toString() + ",department=" + department + "]"; 
	}
}
