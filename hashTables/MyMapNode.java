package ds.hashTables;

import ds.linkedList.INode;

public class MyMapNode<K ,V> implements INode<K>{
	
	K key;
	V value;
	MyMapNode<K, V> next;
	
	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode getNext() {
		return next;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MyMapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		StringBuilder myMapNodes = new StringBuilder();
		myMapNodes.append("MyMapNode {K=").append(key).append(" V=").append(value).append("}");
		if(next!=null) 
			myMapNodes.append("->").append(next);
		return myMapNodes.toString();
	}
	
}
