package ggia.data.structs;

public class StackClient {

	public static void main(String[] args) {
		FixedCapacityStackOfStrings FixedCapacityStack = new FixedCapacityStackOfStrings(10);
		String strpop = new String("");
		// to be or not to - be - - that - - - is
		FixedCapacityStack.push("to");
		FixedCapacityStack.push("be");
		FixedCapacityStack.push("or");
		FixedCapacityStack.push("not");
		
		strpop = FixedCapacityStack.pop();
		System.out.println(strpop);
		
		FixedCapacityStack.push("be");
		
		strpop = FixedCapacityStack.pop();
		System.out.println(strpop);
		
		strpop = FixedCapacityStack.pop();
		System.out.println(strpop);
		
		FixedCapacityStack.push("that");
		
		strpop = FixedCapacityStack.pop();
		System.out.println(strpop);
		
		strpop = FixedCapacityStack.pop();
		System.out.println(strpop);
		
		strpop = FixedCapacityStack.pop();
		System.out.println(strpop);
		
		FixedCapacityStack.push("is");
		
		// Σωστή έξοδος
		// not
		// be
		// or
		// that
		// be
		// to
	}

}
