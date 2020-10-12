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

	@Test
	public void givenNumber30InLinkedListWhenSearchedShouldReturnIndexPositionAs1() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		MyNode<Integer> node = (MyNode<Integer>) myLinkedList.search(30);
		boolean result = node.equals(mySecondNode);
		assertTrue(result);
	}

	@Test
	public void givenNumber40AfterInsertionAfterNumber30ShouldShowLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.insert((MyNode<Integer>) myLinkedList.search(30), myThirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.getHead().equals(myFirstNode)
				&& myLinkedList.getHead().getNext().equals(mySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(myThirdNode)
				&& myLinkedList.getHead().getNext().getNext().getNext().equals(myFourthNode);
		assertTrue(result);
	}

	@Test
	public void givenNumber40AfterDeletionFromLinkedListShouldShowSizeOfLinkedListAs3() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.remove(myLinkedList.search(40));
		myLinkedList.printNodes();
		boolean result = (myLinkedList.size() == 3);
		assertTrue(result);
	}

	@Test
	public void givenNumbersWhenAddedShouldBeSortedInAscendingOrderAndShownInLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new SortedLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.add(myFourthNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.getHead().equals(mySecondNode)
				&& myLinkedList.getHead().getNext().equals(myThirdNode)
				&& myLinkedList.getHead().getNext().getNext().equals(myFirstNode)
				&& myLinkedList.getHead().getNext().getNext().getNext().equals(myFourthNode);
		assertTrue(result);
	}
}