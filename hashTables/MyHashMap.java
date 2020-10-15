package ds.hashTables;

import ds.linkedList.MyLinkedList;

public class MyHashMap<K, V> {

	MyLinkedList myLinkedList;

	public MyHashMap() {
		this.myLinkedList = new MyLinkedList();
	}

	public V get(K key) {
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	public void add(K key, V value) {
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		if (mapNode == null) {
			mapNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(mapNode);
		} else
			mapNode.setValue(value);
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + myLinkedList.toString() + "}";
	}
}
