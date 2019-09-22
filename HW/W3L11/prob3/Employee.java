package W3L11.prob3;

import java.util.Objects;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		Employee e = (Employee) ob;
		return e.getName().equals(name) && e.getSalary() == salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
}
