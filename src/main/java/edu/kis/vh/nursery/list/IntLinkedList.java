package edu.kis.vh.nursery.list;

public class  IntLinkedList {

	private static class Node {

		private int value;
		private Node prev;
		private Node next;

		/**
		 * Instantiates a new Node.
		 *
		 * @param i new value
		 */
		public Node(int i) {
			setValue(i);
		}

		/**
		 * Getter of the value
		 *
		 * @return the value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * Sets value to new value given in the parameter - setter
		 *
		 * @param value the value
		 */
		public void setValue(int value) {
			this.value = value;
		}

		/**
		 * Gets value of prev and returns it
		 *
		 * @return the prev
		 */
		public Node getPrev() {
			return prev;
		}

		/**
		 * Sets prev value to new prev given in the parameters
		 *
		 * @param prev the prev
		 */
		public void setPrev(Node prev) {
			this.prev = prev;
		}

		/**
		 * Gets next and returns the value of it
		 *
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * Sets next to the next value given in the parameter
		 *
		 * @param next the next
		 */
		public void setNext(Node next) {
			this.next = next;
		}
	}

	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
