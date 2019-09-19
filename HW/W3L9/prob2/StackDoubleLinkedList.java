package W3L9.prob2;

class Node {
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

public class StackDoubleLinkedList {
	private Node top; // stack top
	private int size;

	public StackDoubleLinkedList() // constructor
	{
		top = null; // no items in the stack
		size = 0;
	}

	public void push(String item) // add an item on top of stack
	{
		Node newNode = new Node(null, item, null);
		if(top == null) top = newNode;
		else {
			Node tmp = top;
			top = newNode;
			top.next = tmp;
			tmp.previous = top;
		}
		size++;
	}

	public String pop() // remove an item from top of stack
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		String item = top.value; // access top item
		top = top.next;
		top.previous = null;
		size--; // decrement size
		return item;
	}

	public String peek() // get top item of stack
	{
		if (isEmpty())
			return null;
		return (String)top.value;
	}

	public boolean isEmpty() // true if stack is empty
	{
		return (size == 0);
	}

	public int size() // returns number of items in the stack
	{
		return size;
	}
}
