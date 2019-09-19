package W3L8Day2.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList list = new MyArrayList();
		list.add("Bat", "Apple", 550.0);
		list.add("Bat", "Dell", 500.0);
		list.add("Anu", "Apple", 1100.0);
		list.add("Anu", "Apple", 600.0);
		list.add("Agi", "Lenovo", 1000.0);

		System.out.println(list);
		list.sort();
		System.out.println();
		System.out.println(list);

		list.sortbySales();
		System.out.println();
		System.out.println(list);

		List<Marketing> list1000 = list.listMoreThan1000();
		System.out.println(list1000);

	}

}
