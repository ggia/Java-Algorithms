package ggia.data.structs;

public interface StackOfStrings {
	
	void push(String item); // προσθέτει ένα string στην στοίβα

	String pop(); 			// αφαιρεί το τελευταίο string από την στοίβα

	boolean isEmpty(); 		// επιστρέφει true αν έχουμε άδεια στοίβα

	int size(); 			// επιστρέφει μέγεθος στοίβας
}
