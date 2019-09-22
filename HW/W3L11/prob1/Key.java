package W3L11.prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		Key k = (Key) ob;
		return k.getFirstName().equals(firstName)&&k.getLastName().equals(lastName);
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
}
