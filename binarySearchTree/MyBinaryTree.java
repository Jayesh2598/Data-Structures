package ds.binarySearchTree;

public class MyBinaryTree<T extends Comparable<T>> {

	private MyBinaryNode<T> root;

	public void add(T key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<T> addRecursively(MyBinaryNode<T> current, T key) {
		if (current == null)
			return new MyBinaryNode<T>(key);
		int comparison = key.compareTo(current.key);
		if (comparison == 0)
			return current;
		else if (comparison < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}

	public int size() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<T> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
	}
}