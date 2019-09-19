package W3L8Day2.prob1;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {
		// Implement
		if (header == null) {
			header = new Node(null, item, null);
		} else {
			Node tmp = header;
			Node newNode = new Node(null, item, null);
			boolean isless = false;

			while (tmp != null) {
				if (newNode.value.compareTo(tmp.value) > 0) {
					if (tmp.next != null) {
						tmp = tmp.next;
					} else {
						break;
					}
				} else {
					isless = true;
					break;
				}
			}

			if (isless) {
				if (tmp.previous == null) {
					header = newNode;
					header.next = tmp;
					tmp.previous = header;
				} else {
					tmp.previous.next = newNode;
					newNode.previous = tmp.previous;

					newNode.next = tmp;
					tmp.previous = newNode;
				}
			} else {
				tmp.next = newNode;
				newNode.previous = tmp;
			}

		}
	} // insert in a Sorted Order

	public int size() {
		// Implement
		int size = 0;
		for (Node n = header; n != null; n = n.next) {
			size++;
		}
		return size;
	}

	public boolean isEmpty() {
		if (header == null)
			return true;
		else
			return false;
	}

	public Node getFirst() {
		// Implement
		return header;
	}

	public Node getLast() {
		// Implement
		Node last = header;
		for (Node n = header; n != null; n = n.next) {
			if (n.next == null)
				last = n;
		}
		return last;
	}

	public boolean contains(String item) {
		// Implement
		if (item.equals(null))
			return false;
		for (Node n = header; n != null; n = n.next) {
			if (item.equals(n.value))
				return true;
		}
		return false;
	}

	public void removeFirst() {
		// Implement
		if (header != null) {
			if (header.next != null) {
				Node tmp = header;
				header = header.next;
				header.previous = null;
				System.out.println("First item has been removed: " + tmp.value);
				tmp = null;
			}
			else {
				System.out.println("First item was last item: " + header.value);
				header = null;
			}
		}

	}

	void removeLast() {
		// Implement
		if (header != null) {
			for (Node n = header; n != null; n = n.next) {
				if (n.next == null) {
					if (n.previous != null) {
						n.previous.next = null;
						System.out.println("Last item has been removed: " + n);
						n = null;
					} else {
						header = null;
						System.out.println("Last removed item was header: " + n);
						n = null;
					}

					break;
				}
			}
		}
	}

	public void print() {
		if (header != null) {
			print(header);
		}
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		if (n == null)
			System.out.println();
		if (n.next == null) {
			System.out.println(n.value);
		} else {
			System.out.println(n.value);
			print(n.next);
		}
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		mySL.addSort("Agi");
		mySL.addSort("Bat");
		mySL.addSort("Anu");
		mySL.addSort("Dorj");
		mySL.addSort("Ebi");
		mySL.addSort("Saruulaa");
		mySL.addSort("Namuunaa");
		mySL.addSort("Aaa");

		mySL.print();

		System.out.println("SIZE: " + mySL.size());
		System.out.println("IS EMPTY?: " + mySL.isEmpty());
		System.out.println("FIRST: " + mySL.getFirst());
		System.out.println("LAST: " + mySL.getLast());
		System.out.println("Is Anu contained?: " + mySL.contains("Anu"));
		mySL.removeFirst();
		mySL.print();

		mySL.removeLast();
		mySL.removeLast();
		mySL.removeLast();
		mySL.removeLast();
		mySL.removeLast();
		mySL.removeLast();

		mySL.removeFirst();
		mySL.print();
		
		mySL.addSort("Chimeg");
		System.out.println(mySL.toString());
		mySL.removeLast();
		System.out.println(mySL.toString());
	}

}
