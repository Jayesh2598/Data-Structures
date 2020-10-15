package ds.hashTables;

import java.util.ArrayList;

import ds.linkedList.MyLinkedList;

public class MyLinkedHashMap<K, V> {

	private final int noOfBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;

	public MyLinkedHashMap() {
		this.noOfBuckets = 10;
		this.myBucketArray = new ArrayList<>(noOfBuckets);
		for (int i = 0; i < noOfBuckets; i++)
			this.myBucketArray.add(null);
	}

	public V getValueForKey(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	private int getBucketIndex(K key) {
		return (Math.abs(key.hashCode())) % noOfBuckets;
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if (mapNode == null) {
			mapNode = new MyMapNode<>(key, value);
			myLinkedList.append(mapNode);
		} else
			mapNode.setValue(value);
//		System.out.println(value);
	}

	public MyMapNode<K, V> remove(K key) {

		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null)
			return null;
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if (mapNode != null) {
			myLinkedList.remove(mapNode);
			return mapNode;
		} else
			return null;
	}

	public void print() {
		for (MyLinkedList<K> i : myBucketArray) {
			i.printNodes();
		}
	}
}
