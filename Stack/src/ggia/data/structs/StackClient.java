package ggia.data.structs;

public class StackClient {
	
	private static void testStack(StackOfStrings stack) {
		String strpop = new String("");
		// to be or not to - be - - that - - - is
		
		System.out.println(stack.size());
		
		stack.push("to");
		stack.push("be");
		stack.push("or");
		stack.push("not");
		
		System.out.println(stack.size());
		
		// αφαίρεσε το τελευταίο String (το not)
		strpop = stack.pop();
		System.out.println(strpop);
		
		stack.push("be");
		
		// αφαίρεσε το τελευταίο String (το be)
		strpop = stack.pop();
		System.out.println(strpop);
		
		strpop = stack.pop();
		System.out.println(strpop);
		
		// αφαίρεσε το τελευταίο String (το or)
		stack.push("that");
		
		// αφαίρεσε το τελευταίο String (το that)
		strpop = stack.pop();
		System.out.println(strpop);
		
		// αφαίρεσε το τελευταίο String (το be)
		strpop = stack.pop();
		System.out.println(strpop);
		
		// αφαίρεσε το τελευταίο String (το to)
		strpop = stack.pop();
		System.out.println(strpop);
		
		stack.push("is");
	}

	public static void main(String[] args) {
		
		// Πολυμορφισμός: χρήση stack interface class
		StackOfStrings stack = new FixedCapacityStackOfStrings(10);
		
		System.out.println("FixedCapacityStackOfStrings");
		testStack(stack);
		
		System.out.println("LinkedStackOfStrings");
		stack = new LinkedStackOfStrings();
		testStack(stack);
		
		// Σωστή έξοδος κάθε φορά (αν έχει υλοποιηθεί σωστά το stack)
		// not 
		// be
		// or
		// that
		// be
		// to
	}

}
