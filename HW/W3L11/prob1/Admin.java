package W3L11.prob1;

import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		// implement
		HashMap<Key, Student> studentMap = new HashMap<Key, Student>();
		students.forEach((n) -> studentMap.put(new Key(n.getFirstName(), n.getLastName()), n));
		return studentMap;
	}
}
