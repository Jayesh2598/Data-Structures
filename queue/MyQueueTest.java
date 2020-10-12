package ds.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import ds.linkedList.*;

public class MyQueueTest {

	@Test
	public void given3NumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue queue = new MyQueue();
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		queue.printQueue();
		INode firstAddedNode = queue.peek();
		assertEquals(myFirstNode, firstAddedNode);
	}

	@Test
	public void given3NumbersInQueueWhenDequeuedShouldMatchFirstAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue queue = new MyQueue();
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		queue.printQueue();
		boolean result = myFirstNode.equals(queue.dequeue()) && mySecondNode.equals(queue.dequeue())
				&& myThirdNode.equals(queue.dequeue());
		assertTrue(result);
	}
}