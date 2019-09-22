package W3L11.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class SortbySSN implements Comparator<Employee> {
	public int compare(Employee a, Employee b) {
		return Integer.parseInt(a.getSsn()) - Integer.parseInt(b.getSsn());
	}
}

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> slist = new ArrayList<Employee>();
		
		socSecNums.forEach((s) -> { if(table.get(s) != null) if(table.get(s).getSalary()>80000) slist.add(table.get(s));});
		Collections.sort(slist, new SortbySSN());
		return slist;
	}

}
