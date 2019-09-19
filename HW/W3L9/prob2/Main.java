package W3L9.prob2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("STACK IMPLEMENTATION BY DOUBLE LINKEDLIST:");
		StackDoubleLinkedList stk = new StackDoubleLinkedList(); // create stack of size 4

		stk.push("A"); // push 3 items onto stack
		stk.push("B");
		stk.push("C");

		System.out.println("Size: " + stk.size());
		// delete item
		System.out.println(stk.pop() + " is deleted");
		stk.push("D"); // add three more items to the stack
		stk.push("E");
		System.out.println(stk.pop() + " is deleted");
		stk.push("F"); // push one item
		// get top item from the stack
		System.out.println(stk.peek() + " is on top of stack");
		System.out.println("Size of the Stack : " + stk.size());
		
		System.out.println('\n' + "STACK IMPLEMENTATION BY LINKEDLIST:");
		
		StackLinkedList sll = new StackLinkedList(); // create stack of size 4

		sll.push("AA"); // push 3 items onto stack
		sll.push("BB");
		sll.push("CC");

		System.out.println("Size: " + sll.size());
		// delete item
		System.out.println(sll.pop() + " is deleted");
		sll.push("DD"); // add three more items to the stack
		sll.push("EE");
		System.out.println(sll.pop() + " is deleted");
		sll.push("FF"); // push one item
		// get top item from the stack
		System.out.println(sll.peek() + " is on top of stack");
		System.out.println("Size of the Stack : " + sll.size());
	}

}
