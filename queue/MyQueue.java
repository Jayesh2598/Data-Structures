package ds.queue;

import ds.linkedList.*;

public class MyQueue {

	private MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode node) {
		myLinkedList.append(node);
	}

	public INode dequeue() {
		return myLinkedList.pop();
	}

}