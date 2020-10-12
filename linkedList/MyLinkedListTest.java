package ds.linkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.getHead().equals(myThirdNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(myFirstNode);
		assertTrue(result);
	}

	@Test
	public void given3NumbersWhenAppendedToLinkedListShouldBeAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.getHead().equals(myFirstNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void givenNumberWhenInsertedBetweenTwoNumbersShouldShowLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.getHead().equals(myFirstNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void givenFirstNumberInLinkedListWhenDeletedShouldShowLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.pop();
		myLinkedList.printNodes();
		boolean result = myLinkedList.getHead().equals(mySecondNode)
				&& myLinkedList.getHead().getNext().equals(myThirdNode);
		assertTrue(result);
	}

	@Test
	public void givenLastNumberInLinkedListWhenDeletedShouldShowLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.popLast();
		myLinkedList.printNodes();
		boolean result = myLinkedList.getHead().equals(myFirstNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode);
		assertTrue(result);
	}
}