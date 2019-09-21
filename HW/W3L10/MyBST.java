package W3L10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	// ######## BEGINNING ########

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		// implement
		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		// implement
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}

	}

	public boolean contains(Integer key) {
		// implement
		BinaryNode tmp = root;
		while (tmp != null) {
			if (tmp.element == key)
				return true;
			else {
				if (key < tmp.element)
					tmp = tmp.left;
				else
					tmp = tmp.right;
			}
		}
		return false;
	}

	public Integer getRoot() {
		// implement
		return (int) root.element;
	}

	public Integer leafNodes() {
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t) {
		// Implement
		if (t != null) {
			if (t.left == null && t.right == null)
				return 1 + leafNodes(t.left) + leafNodes(t.right);
			else
				return leafNodes(t.left) + leafNodes(t.right);
		}
		return 0;
	}

	public int size() {
		// implement
		BinaryNode tmp = root;

		return size(tmp);
	}

	private int size(BinaryNode t) {
		// implement
		if (t != null) {
			return 1 + size(t.left) + size(t.right);
		}
		return 0;
	}

	public boolean isEmpty() {
		// implement
		// check the tree is empty or not
		return (size() < 1) ? true : false;
	}

	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode t) {
		// implement
		if (t.left == null)
			return t.element;

		else
			return findMin(t.left);

	}

	public Integer findMax() {
		// implement
		return findMax(root);
	}

	private Integer findMax(BinaryNode t) {
		// IMPLEMENT
		if (t.right == null) {
			return t.element;
		}
		return findMax(t.right);
	}

	// ######## END ########

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		mybst.insert(12);
		mybst.printTree();

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);

		System.out.println(str);
		System.out.print("PreOrder traversal:  ");
		mybst.preOrder();
		System.out.println();
		System.out.print("InOrder traversal:   ");
		mybst.printTree();
		System.out.println();
		System.out.print("PostOrder traversal: ");
		mybst.postOrder();
		System.out.println('\n' + "Is BT empty? " + mybst.isEmpty());
		System.out.println("Is 25 contained? " + mybst.contains(25));
		System.out.println("ROOT: " + mybst.getRoot());
		System.out.println("SIZE: " + mybst.size());
		System.out.println("Number of Leaf nodes: " + mybst.leafNodes());
		System.out.println("Min Node: " + mybst.findMin());
		System.out.println("Max Node: " + mybst.findMax());

	}
}
