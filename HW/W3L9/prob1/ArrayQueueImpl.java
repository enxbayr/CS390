package W3L9.prob1;

import java.util.Arrays;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {
		// implement
		if (front == -1)
			return -1;
		else
			return arr[front];
	}

	public void enqueue(int obj) {
		// implement
		if (front == -1) {
			front++;
			arr[rear] = obj;
		} else {
			if (arr.length == rear + 1)
				resize();
			rear++;
			arr[rear] = obj;
		}
	}

	public int dequeue() {
		// implement
		int tmp;
		if (front == -1)
			tmp = -1;
		else {
			tmp = arr[front];
			int[] tmpArr = arr;
			arr = new int[arr.length - 1];
			arr = Arrays.copyOfRange(tmpArr, 1, rear + 1);
			rear--;
			if (rear == -1) {
				front = -1;
				rear = 0;
			}
		}
		return tmp;
	}

	public boolean isEmpty() {
		// implement
		if (size() == 0)
			return true;
		return false;
	}

	public int size() {
		// implement
		return rear + 1;
	}

	private void resize() {
		// implement
		int[] tmpArr = arr;
		arr = Arrays.copyOfRange(tmpArr, 0, tmpArr.length * 2);
	}
}