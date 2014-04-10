package ggia.data.structs;

class HighArray {
	private long[] a;                 		// ref to array a
	private int nElems;               		// number of data items
	//-----------------------------------------------------------
	public HighArray(int max) {		  		// constructor
		a = new long[max];            		// create the array
		nElems = 0;                        	// no items yet
	}
	//-----------------------------------------------------------
	public boolean find(long searchKey)	{	// find specified value
		int j;
		for(j=0; j<nElems; j++)            	// for each element,
			if(a[j] == searchKey)           // found item?
				break;                      // exit loop before end
		if(j == nElems)                    	// gone to end?
			return false;                   // yes, can't find it
		else
			return true;                    // no, found it
	}  // end find()
	//-----------------------------------------------------------
	public void insert(long value) {		// put element into array
		a[nElems] = value;					// insert it
		nElems++;							// increment size
	}
	//-----------------------------------------------------------
	public boolean delete(long value) {
		int j;
		for(j=0; j<nElems; j++)			// look for it
			if( value == a[j] )
				break;
		if(j==nElems)					// can't find it
			return false;
		else							// found it
		{
			for(int k=j; k<nElems; k++)	// move higher ones down
				a[k] = a[k+1];
			nElems--;					// decrement size
			return true;
		}
	}  // end delete()

	public void display() {            		// displays array contents
		for(int j=0; j<nElems; j++)       	// for each element,
			System.out.print(a[j] + " ");  	// display it
		System.out.println("");
	}
	//-----------------------------------------------------------
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	//-----------------------------------------------------------
	public void bubbleSort() {
		int out, in;

		for(out=nElems-1; out>1; out--)   // outer loop (backward)
			for(in=0; in<out; in++)       // inner loop (forward)
				if( a[in] > a[in+1] )     // out of order?
					swap(in, in+1);       // swap them
	}  // end bubbleSort
	//-----------------------------------------------------------
	public void selectionSort() {
		int out, in, min;

		for(out=0; out<nElems-1; out++) { 	 // outer loop
			min = out;                    	 // minimum
			for(in=out+1; in<nElems; in++)	 // inner loop
				if(a[in] < a[min] )       	 // if min greater,
					min = in;           	 	 // we have a new min
			swap(out, min);          	     // swap them
		}  // end for(out)
	}  // end selectionSort()
	//-----------------------------------------------------------
	public void insertionSort() {
		int in, out;

		for(out=1; out<nElems; out++) {   	// out is dividing line
			long temp = a[out];            	// remove marked item
			in = out;                      	// start shifts at out
			while(in>0 && a[in-1] >= temp) { // until one is smaller,
				a[in] = a[in-1];            	// shift item to right
				--in;                       	// go left one position
			}
			a[in] = temp;                  	// insert marked item
		}  // end for
	}  // end insertionSort()
	//-----------------------------------------------------------
}  
