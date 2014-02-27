package ggia.data.structs;

public interface QueueOfStrings {
	void enqueue(String item);		// προσθήκη στην ουρά
	String dequeue();				// αφαίρεση από την ουρά
	boolean isEmpty();				// είναι η ουρά άδεια;
	int size();						// μέγεθος ουράς

}
