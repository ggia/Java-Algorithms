package ggia.data.structs;

import java.util.LinkedList;


public class UsingJavaQueue {

private static void testQueue(LinkedList<String> queue) {
		
		// to be or not to - be - - that - - - is
		queue.add("to");
		queue.add("be");
		queue.add("or");
		queue.add("not");
		queue.add("to");
		
		System.out.println(queue.removeFirst());
		
		queue.add("be");
		
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		
		queue.add("that");
		
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		
		queue.add("is");
	}

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		
		testQueue(queue);
		
		// έξοδος
		// to
		// be
		// or 
		// not
		// to
		// be
	}

}
