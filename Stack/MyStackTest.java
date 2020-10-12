package ds.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import ds.linkedList.*;

public class MyStackTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack stack = new MyStack();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode topNode = stack.peek();
		stack.printStack();
		assertEquals(myThirdNode, topNode);
	}

	@Test
	public void given3NumbersInStackWhenPoppedShouldMatchLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack stack = new MyStack();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		stack.printStack();
		boolean result = myThirdNode.equals(stack.pop()) && mySecondNode.equals(stack.pop())
				&& myFirstNode.equals(stack.pop());
		assertTrue(result);
	}
}