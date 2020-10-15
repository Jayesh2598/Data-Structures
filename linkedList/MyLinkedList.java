package ds.linkedList;

public class MyLinkedList<K> {

	protected INode head;
	protected INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode getHead() {
		return head;
	}

	public INode getTail() {
		return tail;
	}

	public void setHead(INode head) {
		this.head = head;
	}

	public void setTail(INode tail) {
		this.tail = tail;
	}

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("Nodes sequence:\n");
		INode tempNode = this.head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!(tempNode == this.tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public void add(INode node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			INode tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}

	public void insert(INode node, INode newNode) {
		INode tempNode = node.getNext();
		node.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode pop() {
		INode popped = this.head;
		INode tempNode = this.head.getNext();
		this.head = tempNode;
		return popped;
	}

	public void popLast() {
		INode tempNode = this.head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(null);
	}

	public INode search(K key) {
		INode tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			} else {
				tempNode = tempNode.getNext();
			}
		}
		return null;
	}

	public INode remove(INode node) {
		INode tempNode = this.head;
		INode prev = null;
		while (tempNode.getNext() != null) {
			if (tempNode.getKey().equals(node.getKey()))
				break;
			prev = tempNode;
			tempNode = tempNode.getNext();
		}
		prev.setNext(tempNode.getNext());
		tempNode.setNext(null);
		return tempNode;
	}

	public int size() {
		INode tempNode = this.head;
		int size = 1;
		while (tempNode.getNext() != null) {
			size++;
			tempNode = tempNode.getNext();
		}
		return size;
	}
}