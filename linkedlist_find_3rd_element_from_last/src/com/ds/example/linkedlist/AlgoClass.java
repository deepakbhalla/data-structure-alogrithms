package com.ds.example.linkedlist;

public class AlgoClass {

	public static void main(String[] args) {

		int elementPosition = 3;
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(new LinkedList.Node("1"));
		linkedList.add(new LinkedList.Node("2"));
		linkedList.add(new LinkedList.Node("3"));
		linkedList.add(new LinkedList.Node("4"));
		linkedList.add(new LinkedList.Node("5"));
		linkedList.add(new LinkedList.Node("6"));
		linkedList.add(new LinkedList.Node("7"));

		LinkedList.Node current = linkedList.head;
		LinkedList.Node threeByCounter = linkedList.head;
		int length = 1;

		while (current.next != null) {
			length++;
			if (length > elementPosition) {
				threeByCounter = threeByCounter.next;
			}
			current = current.next;
			System.out.println("length: " + length + ", current: " + current + ", threeCounter: " + threeByCounter);
		}

		System.out.println("\nLength of the list : " + length);
		System.out.println("3rd Last element in the list: " + threeByCounter);
	}
}
