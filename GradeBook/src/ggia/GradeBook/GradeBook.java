package ggia.GradeBook;

public class GradeBook {
	
	// διαθέσιμη μεταβλητή μόνο μέσα στο obj της κλάσης.
	private String courseName;
	
	// ctor
	
	public GradeBook(String name) {
		courseName=name;
	}
	
	// display a welcome message to the GradeBook user
	// public: αυτή η μέθοδος είναι διαθέσιμη σε όλους (κοινό)
	// αν γίνει private θα δημιουργηθεί μήνυμα λάθους στην GradeBookTest.java
	public void displayMessage() {
		System.out.printf("Welcome to the Grade Book %s!\ndf", getCourseName());
	} // τέλος της κλήσης της μεθόδου

	// overload προηγούμενης μεθόδου
	public void displayMessage(String courseName) {
		System.out.printf("Welcome to the Grade Book for \n%s!\n", courseName);
	}
	
	public void setCourseName(String name) {
		courseName=name;
	}
	
	public String getCourseName() {
		return courseName;
	}
} // τέλος της κλάσης GradeBook
