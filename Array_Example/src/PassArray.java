
public class PassArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4, 5};
		
		System.out.println("Effects of passing reference to entire array: \n"+
		               "The values of the original array are:");
		
		for (int value: array) 
			System.out.printf("\t%d", value);
		
		modifyArray(array);		// pass array reference
		System.out.println("\n\nThe values of the modified array are:");
		
		// output modified array elements
		for (int value: array)
			System.out.printf("\t%d", value);
		
		System.out.printf("\n\nEffects of passing array element value:\n"+
		                  "array[3] before modifyElement: %d\n", array[3]);
		
		modifyElement(array[3]);	// attenmpt to modify array[3]
		System.out.printf("array[3] after modifyElement: %d\n", array[3]);

	}

	private static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement: %d\n", element);
	}

	private static void modifyArray(int[] array_passed) {
		for (int counter=0; counter<array_passed.length; counter++)
			array_passed[counter] *= 2;
		
	}
	
	

}
