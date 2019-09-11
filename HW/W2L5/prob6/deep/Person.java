package W2L5.prob6.deep;

import java.util.Objects;

public class Person implements Cloneable {

	private String name;
	private Computer computer; // Refer from the Problem 5.

	public Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	public String getName() {
		return name;
	}

	public Computer getComputer() {
		return computer;
	}
	
	public void setComputer(Computer c) {
		this.computer = c;
	}

	public String toString() {
		return name + " : " + computer.toString();
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (getClass() != ob.getClass())
			return false;
		Person p = (Person) ob;
		return p.getName().equals(name) && p.getComputer().equals(computer);
	}

	public int hashCode() {
		return Objects.hash(name, computer);
	}

	public Object clone() throws CloneNotSupportedException {

		Person clone = (Person) super.clone();

		clone.computer = (Computer) this.computer.clone();

		return clone;
	}

}
