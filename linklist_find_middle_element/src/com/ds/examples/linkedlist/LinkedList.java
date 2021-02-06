package com.ds.examples.linkedlist;

public class LinkedList {

	private Node head;
	private Node tail;

	public LinkedList() {
		this.head = new Node("head");
		this.tail = this.head;
	}

	public Node head() {
		return this.head;
	}

	public void add(Node node) {
		this.tail.next = node;
		this.tail = node;
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
