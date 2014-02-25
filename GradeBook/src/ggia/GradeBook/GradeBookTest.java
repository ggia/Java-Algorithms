package ggia.GradeBook;

import java.util.Scanner;

public class GradeBookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GradeBook myGradeBook = new GradeBook("");
		
		// χρήση operational overload
		myGradeBook.displayMessage();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a course name: " );
		// διάβασε μια γραμμή
		String nameOfCourse = input.nextLine();
		
		myGradeBook.displayMessage(nameOfCourse);

		input.close();
	}

}
