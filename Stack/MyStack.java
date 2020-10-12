package ds.Stack;

import ds.linkedList.*;

public class MyStack {

	private MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(MyNode<Integer> node) {
		myLinkedList.add(node);
	}

	public INode peek() {
		return myLinkedList.getHead();
	}

	public void printStack() {
		myLinkedList.printNodes();
	}
}
