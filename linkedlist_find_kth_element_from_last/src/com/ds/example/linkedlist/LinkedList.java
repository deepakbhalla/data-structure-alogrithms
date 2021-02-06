package com.ds.example.linkedlist;

public class LinkedList {

	public Node head;
	public Node tail;

	public LinkedList() {
		this.head = new LinkedList.Node("head");
		tail = head;
	}

	public void add(Node node) {
		tail.next = node;
		tail = node;
	}

	public static class Node {

		private String data;
		private Node next;

		public Node(String data) {
			this.data = data;
		}

		public String data() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		public String toString() {
			return this.data;
		}
	}
}
