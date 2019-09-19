package W3L9.prob1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueueImpl aq = new ArrayQueueImpl();
		
		aq.enqueue(1);
		aq.enqueue(2);
		aq.enqueue(3);
		aq.enqueue(4);
		aq.enqueue(5);
		aq.enqueue(6);
		aq.enqueue(7);
		aq.enqueue(8);
		aq.enqueue(9);
		aq.enqueue(10);
		aq.enqueue(11);
		aq.enqueue(12);
		
		System.out.println("PEEK: " + aq.peek());
		
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		System.out.println("DEQUEUE: " + aq.dequeue());
		
		System.out.println("PEEK: " + aq.peek());

	}

}
