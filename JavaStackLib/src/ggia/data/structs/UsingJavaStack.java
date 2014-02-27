package ggia.data.structs;

import  java.util.Stack;

public class UsingJavaStack {
	
	private static void testStack(Stack<String> stack) {
		String strpop = new String("");
		// to be or not to - be - - that - - - is
		
		stack.push("to");
		stack.push("be");
		stack.push("or");
		stack.push("not");
		
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
		Stack<String> stack = new Stack<String>();
		
		
		testStack(stack);
		
		// Έξοδος
		// not
		// be
		// or
		// that
		// be
		// to
			
	}

}
