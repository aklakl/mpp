package com.mpp.lab10.prob6;

import java.util.Date;

public class Queue {
	class Node {
		Object value;
		Node next;
	}

	private Node head;
	private Node tail;

	public void add(Object newValue) {
		Node n = new Node();
		if (head == null)
			head = n;
		else
			tail.next = n;
		tail = n;
		tail.value = newValue;
	}

	public Object remove() {
		if (head == null)
			return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	//
	public String toString() {
		StringBuilder sb = new StringBuilder();
		while (tail.next != null) {
			sb.append(tail.value);
			tail = tail.next;
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Queue c = new Queue();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 0; i < 50; ++i) {
						c.add(new Date().toString());
						System.out.println("Adding node...");
						Thread.sleep(1);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});
		t.start();
		
		new Queue().printValues();

	}

	public void printValues() {
//		while (tail != null) {
			System.out.println(head.value);
//			head = head.next;
//		}
	}
}