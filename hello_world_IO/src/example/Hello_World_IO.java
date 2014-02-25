package example;

import java.util.Scanner;

/**
 * @author      Georgios Giannopoulos <georgios.giannopoulos@gmail.com>
 * @version     1.0             
 * @since       2014-02-07          (the version of the package this class was first added to)
 */

public class Hello_World_IO {

	/**
	 * void σημαίνει ότι δεν επιστρέφει τίποτα
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);	// παίρνω το Scanner object
		System.out.println("Value for n: ");	// System.out: standard output object
		int n = keyb.nextInt();
		// double n = keyb.nextDouble(); 	// για είσοδο τύπο double
		// String str = keyb.nextLine();	// για είσοδο αλφαρηθμιτικό
		int nCarre = n*n;
		System.out.println("The var is " + n + " and n*n is " + nCarre);
		
		keyb.close();	// το ότι πρέπει να κλείσουμε το έβγαλε μήνυμα το eclipse
	}

}
