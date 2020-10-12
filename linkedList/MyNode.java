package ds.linkedList;

public class MyNode<T> {
	private T key;
	private MyNode next;

	public MyNode(T key) {
		this.key = key;
		this.next = null;
	}

	public T getKey() {
		return key;
	}

	public MyNode getNext() {
		return next;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
	
	
}
