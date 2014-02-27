package ggia.data.structs;

public class FixedCapacityStackOfStrings implements StackOfStrings {

	private String[] s;
	
	private int N=0;
	
	FixedCapacityStackOfStrings(int capacity) {
		s = new String[capacity];
	}
	
	@Override
	public void push(String item) {
		// χρήση Ν και μετά αύξηση κατά 1
		s[N++]=item;
	}

	@Override
	public String pop() {
		// πρώτα μείωση κατά 1 και μετά χρήση του N
		return s[--N];
	}

	@Override
	public boolean isEmpty() {
		return N==0;
	}

	@Override
	public int size() {
		return N;
	}

}
