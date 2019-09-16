package W3L8.prob8_2;

class Person {
	private String lastName;
	private String firstName;
	private int age;

// -------------------------------------------------------------- 
	public Person(String first, String last, int a) { // constructor
		firstName = first;
		lastName = last;
		age = a;
	}

// -------------------------------------------------------------- 
	public String getLast() { // get last name
		return lastName;
	}
	
	public String getFirst() { // get last name
		return firstName;
	}
	
	public int getAge() { // get last name
		return age;
	}
	
	@Override
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		Person p = (Person) ob;
		return p.getLast().equals(lastName) && p.getFirst().equals(firstName) && p.getAge() == age;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", FirstName=" + firstName + ", Age=" + age + "]";
	}
} // end class Person
