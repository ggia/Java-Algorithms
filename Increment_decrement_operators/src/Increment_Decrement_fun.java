public class Increment_Decrement_fun {

	public static void main(String[] args) {
		int a;
		int b;

		// 1η περίπτωση: b++
		System.out.println("1η περίπτωση: b++");
		a = 5;
		b = 3;
		int c = a * b++;
		// πόσο είναι το c;
		System.out.println(b);
		// πόσο είναι το b;
		System.out.println(c);

		System.out.println(); // κενή γραμμή - newline

		// 2η περίπτωση: b++
		System.out.println("2η περίπτωση: ++b");
		a = 5;
		b = 3;
		int d = a * ++b;
		// πόσο είναι το d;
		System.out.println(b);
		// πόσο είναι το d;
		System.out.println(d);

		System.out.println(); // κενή γραμμή - newline

		// 3η περίπτωση: --b
		System.out.println("3η περίπτωση: --b");
		a = 5;
		b = 3;
		a = --b;
		// πόσο είναι το a;
		System.out.println(a);
		// πόσο έιναι το b;
		System.out.println(b);

		System.out.println(); // κενή γραμμή - newline

		// 4η περίπτωση: b--
		System.out.println("4η περίπτωση: b--");
		a = 5;
		b = 3;
		a = b--;
		// πόσο είναι το a;
		System.out.println(a);
		// πόσο έιναι το b;
		System.out.println(b);

		System.out.println(); // κενή γραμμή - newline

		// 5η περίπτωση: b++
		System.out.println("5η περίπτωση: b++");
		b = 3;
		System.out.println(b++); // τι τυπώνει;
		System.out.println(b); // πόσο είναι το b;

		System.out.println(); // κενή γραμμή - newline

		// 6η περίπτωση: ++b
		System.out.println("6η περίπτωση: ++b");
		b = 3;
		System.out.println(++b); // τι τυπώνει;
		System.out.println(b);

		System.out.println(); // κενή γραμμή - newline

		// 7η περίπτωση: a++, ++a σε έλεγχο if:
		System.out.println("7η περίπτωση: if (a++==4) και if (a++==4)");
		a = 3;
		if (a++ == 4) {
			System.out
					.println("Το a=3 στο if (a++=4) γίνεται 4==4 στον έλεγχο.");
		} else {
			System.out
					.println("Το a=3 στο if (a++=4) ΔΕΝ ΓΙΝΕΤΑΙ 4==4 στον έλεγχο.");
		}
		
		a = 3;
		if (++a == 4) {
			System.out
					.println("Το a=3 στο if (a++=4) γίνεται 4==4 στον έλεγχο.");
		} else {
			System.out
					.println("Το a=3 στο if (a++=4) ΔΕΝ ΓΙΝΕΤΑΙ 4==4 στον έλεγχο.");
		}

		System.out.println(); // κενή γραμμή - newline

		// 8η περίπτωση: πολλά ++a σε μια έκφραση.
		System.out.println("8η περίπτωση: πολλά ++a σε μια έκφραση");
		a = 2;
		int v = ++a + ++a * ++a; 	// η τιμή υπολογίζεται τρέχοντας αυτό => v = 3
									// + 4 * 5;
									// γίνεται evaluate από αριστερά προς τα
									// δεξιά
									// http://docstore.mik.ua/orelly/java-ent/jnut/ch02_05.htm
									// " The interpreter always evaluates operands in order from left to right."
		System.out.println(v);

		// 9η περίπτωση: μίξη ++a και --a σε μια έκφραση - advanced - δύσκολο
		System.out.println("9η περίπτωση: μίξη ++a, a++ και --a σε μια έκφραση");
		a = 2;
		v = ++a + a++ * a--; 	// η τιμή υπολογίζεται τρέχοντας αυτό => v = 3 + 3*4
								// να το συζητήσουμε μαζί αυτό!
		System.out.println(v);

		System.out.println(); // κενή γραμμή - newline
		
		// 9η περίπτωση: μίξη ++a και --a σε μια έκφραση - advanced - δύσκολο
		System.out.println("9η περίπτωση: μίξη ++a, a++ και --a σε μια έκφραση");
		a = 2;
		v = ++a + a-- * a--; 	// η τιμή υπολογίζεται τρέχοντας αυτό => v = 3 + 3*2
								// να το συζητήσουμε μαζί αυτό!
		System.out.println(v);
		
		System.out.println(); // κενή γραμμή - newline
		
		// 10η περίπτωση: μίξη ++c και c++ σε μια έκφραση - advanced - δύσκολο
		System.out.println("10η περίπτωση: μίξη ++c, c++ σε μια έκφραση");
		c=18;
		v=++c+c++;				// η τιμή υπολογίζεται τρέχοντας αυτό => v = 19 + 19
		System.out.println(v);
		System.out.println(c);	// το c έχει τιμή 20
	}

}
