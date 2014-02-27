package ggia.data.structs;

public class QueueClient {

	private static void testQueue(QueueOfStrings queue) {
		
		// to be or not to - be - - that - - - is
		queue.enqueue("to");
		queue.enqueue("be");
		queue.enqueue("or");
		queue.enqueue("not");
		queue.enqueue("to");
		
		System.out.println(queue.dequeue());
		
		queue.enqueue("be");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.enqueue("that");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.enqueue("is");
	}
	
	public static void main(String[] args) {
		QueueOfStrings queue= new LinkedQueueOfStrings();
		
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
