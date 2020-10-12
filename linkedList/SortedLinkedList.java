package ds.linkedList;

public class SortedLinkedList extends MyLinkedList {

	public static <T extends Comparable<T>> boolean maximum(INode node1, INode node2) {
		Integer value1 = (Integer) node1.getKey();
		Integer value2 = (Integer) node2.getKey();
		if (value1.compareTo(value2) > 0)
			return true;
		else
			return false;
	}

	public void insertPrevious(INode node, INode newNode) {
		INode tempNode = this.head;
		while (!(tempNode.getNext().equals(node)))
			tempNode = tempNode.getNext();
		insert(tempNode, newNode);
	}

	@Override
	public void add(INode node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			if (size() == 1) {
				if (maximum(node, this.head))
					append(node);
				else
					super.add(node);
			} else {
				if (!(maximum(node, this.head)))
					super.add(node);
				else {
					INode tempNode = this.head;
					while (maximum(node, tempNode) && tempNode.getNext() != null)
						tempNode = tempNode.getNext();
					if (!maximum(node, tempNode))
						insertPrevious(tempNode, node);
					else
						append(node);
				}
			}
		}
	}
}
