package ggia.data.structs;

public class LinkedQueueOfStrings implements QueueOfStrings {

	private class Node {
		String item;
		Node next;
	}
	
	private Node first=null;
	private Node last=null;
	
	@Override
	public void enqueue(String item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		if (isEmpty())
			first = last;
		else 
			oldlast.next=last;
	}

	@Override
	public String dequeue() {
		String item = first.item;
		first = first.next;
		if (isEmpty())
			last = null;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return first==null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
