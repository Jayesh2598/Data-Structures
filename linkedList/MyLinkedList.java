package ds.linkedList;

public class MyLinkedList {

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
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!(tempNode == tail))
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

	public void pop() {
		INode tempNode = this.head.getNext();
		this.head = tempNode;
	}

	public void popLast() {
		INode tempNode = this.head;
		while (tempNode.getNext().getNext() != null) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(null);
	}

	public INode search(Integer value) {
		INode tempNode = this.head;
		INode wantedNode = null;
		while (tempNode.getNext() != null) {
			if ((Integer) tempNode.getKey() == value) {
				wantedNode = tempNode;
				break;
			}
			tempNode = tempNode.getNext();
		}
		return wantedNode;
	}

	public void remove(INode node) {
		if ((Integer) this.head.getKey() == node.getKey())
			pop();
		else if ((Integer) this.tail.getKey() == node.getKey())
			popLast();
		else {
			INode tempNode = this.head;
			while (tempNode.getNext() != null) {
				if ((Integer) tempNode.getNext().getKey() == node.getKey()) {
					INode tempNode1 = tempNode.getNext().getNext();
					tempNode.setNext(tempNode1);
				}
				tempNode = tempNode.getNext();
			}
		}
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