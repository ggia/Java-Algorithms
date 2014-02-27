package ggia.data.structs;

public class LinkedStackOfStrings implements StackOfStrings {

	private class Node {
		String item;
		Node next;
	}
	
	private Node first = null;
	
	@Override
	public void push(String item) {
		Node oldfirst=first;
		first = new Node();
		first.item=item;
		first.next=oldfirst;
	}

	@Override
	public String pop() {
		String item=first.item;
		first=first.next;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return first==null;
	}

	@Override
	public int size() {
		if (isEmpty())
			return 0;
		int nr=1;
		Node i=first;
		while (i.next!=null) {
			i=i.next;
			nr++;
		}
		
		return nr;
	}

}
