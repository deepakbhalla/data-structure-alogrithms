package com.ds.example.linkedlist;

public class AlgoClass {

	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ls.add(new LinkedList.Node("1"));
		ls.add(new LinkedList.Node("2"));
		ls.add(new LinkedList.Node("3"));
		ls.add(new LinkedList.Node("4"));
		ls.add(new LinkedList.Node("5"));
		ls.add(new LinkedList.Node("6"));
		ls.add(new LinkedList.Node("7"));
		ls.add(new LinkedList.Node("8"));
		
		getLastNode(ls, 2);
		getLastNode(ls, 3);
		getLastNode(ls, 4);
		getLastNode(ls, 5);
	}

	private static LinkedList.Node getLastNode(LinkedList ls, int i) {

		LinkedList.Node fast = ls.head;
		LinkedList.Node slow = ls.head;
		int counter = 1;
		
		while (fast.next() != null) {
			counter++;
			if (counter > i) {
				slow = slow.next();
			}
			fast = fast.next();
		}
		
		System.out.println(i + " element from last of the list : " + slow);
		
		return slow;
	}

}
