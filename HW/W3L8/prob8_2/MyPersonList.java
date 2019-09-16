package W3L8.prob8_2;

;

public class MyPersonList {
	private final int INITIAL_LENGTH = 4;
	private Person[] pArray;
	private int size;

	public MyPersonList() {
		pArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Person p) {
		if (size == pArray.length)
			resize();
		pArray[size++] = p;
	}

	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return pArray[i];
	}

	public boolean find(String ln) {
		for (Person e : pArray) {
			System.out.println("HERE: " + e.toString());
			if (e != null) {
				if (e.getLast().equals(ln))
					return true;
			}
		}
		return false;
	}

	public void insert(Person p, int pos) {
		if (pos > size)
			return;
		if (pos >= pArray.length || size + 1 > pArray.length) {
			resize();
		}
		Person[] temp = new Person[pArray.length + 1];
		System.arraycopy(pArray, 0, temp, 0, pos);
		temp[pos] = p;

		System.arraycopy(pArray, pos, temp, pos + 1, pArray.length - pos);
		pArray = temp;
		++size;

	}

	public boolean remove(Person p) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (pArray[i].equals(p)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[pArray.length];
		System.arraycopy(pArray, 0, temp, 0, index);
		System.arraycopy(pArray, index + 1, temp, index, pArray.length - (index + 1));
		pArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = pArray.length;
		int newlen = 2 * len;
		Person[] temp = new Person[newlen];
		System.arraycopy(pArray, 0, temp, 0, len);
		pArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(pArray[i].toString() + '\n');
		}
		sb.append(pArray[size - 1].toString() + "}");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList pl = new MyPersonList();
		pl.add(new Person("Bob", "Bush", 20));
		pl.add(new Person("Steve", "Jobes", 30));
		pl.add(new Person("Susan", "Sarandon", 35));
		pl.add(new Person("Mark", "Twain", 25));
		pl.add(new Person("Dave", "Jones", 27));
		System.out.println("The list of size " + pl.size() + " is " + pl);

		System.out.println("Is Jobes in the list? " + pl.find("Jobes"));

		Person rem1 = new Person("Mark", "Twain", 25);
		Person rem2 = new Person("Bob", "Bush", 20);
		pl.remove(rem1);
		pl.remove(rem2);
		System.out.println("The list of size " + pl.size() + " is " + pl);

		Person ins1 = new Person("Richard", "Gir", 28);
		pl.insert(ins1, 3);
		System.out.println("The list of size " + pl.size() + " after inserting Richard into pos 3 is " + pl);
		Person ins2 = new Person("Tonya", "Smith", 22);
		pl.insert(ins2, 0);
		System.out.println("The list of size " + pl.size() + " after inserting Tonya into pos 0 is " + pl);
	}

}
