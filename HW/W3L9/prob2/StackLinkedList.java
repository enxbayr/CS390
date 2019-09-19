package W3L9.prob2;

import java.util.LinkedList;

public class StackLinkedList {
	private LinkedList<String> list; // stack top

	public StackLinkedList() // constructor
	{
		list = new LinkedList<String>(); // no items in the stack
	}

	public void push(String item) // add an item on top of stack
	{
		list.add(item);
	}

	public String pop() // remove an item from top of stack
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		String item = list.get(list.size() - 1); // access top item
		list.remove(list.size() - 1);
		return item;
	}

	public String peek() // get top item of stack
	{
		if (isEmpty())
			return null;
		return list.get(list.size() - 1);
	}

	public boolean isEmpty() // true if stack is empty
	{
		return (list.size() == 0);
	}

	public int size() // returns number of items in the stack
	{
		return list.size();
	}
}
