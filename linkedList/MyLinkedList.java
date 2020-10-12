package ds.linkedList;

public class MyLinkedList {
	
	private INode head;
	private INode tail;

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



	public void add(INode node) {
		if(this.tail == null)
			this.tail = node;
		if(this.head == null)
			this.head = node;
		else {
			INode tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}
	
	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("Nodes sequence:\n");
		INode tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!(tempNode==tail)) 
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}

