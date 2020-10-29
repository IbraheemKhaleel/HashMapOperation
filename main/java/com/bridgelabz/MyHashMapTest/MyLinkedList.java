package com.bridgelabz.MyHashMapTest;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null ;
	}
	public void add(INode<K> newNode) {
		if(this.head == null )
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	public void append(INode newNode) {
		if(this.head == null )
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;	
		}		
	}
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);	
	}
	public INode delete() {
		INode tempNode =  this.head ;
		this.head = this.head.getNext();
		return tempNode;	
	}
	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes  ");
		INode tempNode = head ;
		while (tempNode.getNext()!= null ) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("  ->  ");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);	
	}
	public INode<K> search(K key){
		INode<K> tempNode = head ;
		while(tempNode != null && tempNode.getNext() != null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	/*public void printMyNodes() {
		System.out.println(" My nodes are " + head);
	}
	*/
	@Override
	public String toString()
	{
		return "My Linked List nodes { " + head + '}' ;
	}
}