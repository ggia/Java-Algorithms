public class object_count_driver {

	/** 
	 * Η ιδέα είναι να φτιάξουμε ένα αντικείμενο με static και μην static
	 * μεταβλητές και να δούμε την διαφορά μεταξύ τους
	 */
	public static void main(String[] args) {
		// δημιουργία της μεταβλητής obj1 η οποία θα δείχνει (reference) 
		// αντικείμενα τύπου ObjectCount
		ObjectCount obj1;
		
		// Ξεκίνημα - δημιουργία (new) ObjectCount (με τιμές στον constructor 1,2)
		obj1 = new ObjectCount(1,2);
		// Εμφάνιση των δεδομένων που έχει η obj1 (καλείται η toString())
		System.out.println(obj1);
		
		// Ξεκίνημα - δημιουργία (new) ObjectCout (με τιμές στον constructor 3,4)
		obj1 = new ObjectCount(3,4);
		// Εμφάνιση των δεδομένων που έχει η obj1
		System.out.println(obj1);
		
		// Ερώτηση; Τι απέγινε το πρώτο obj με τιμές a=1, b=2;
		
		// φτιάχνω μερικά αντικείμενα ακόμη..
		
		ObjectCount obj2 = new ObjectCount(5,3);
		ObjectCount obj3 = new ObjectCount(3,8);
		ObjectCount obj4 = new ObjectCount(4,10);
		
		// Πόσα objects/instances της κλάσης ObjectCount υπάρχουν;
		
		System.out.println("Obj4.getInstance_cout():");
		System.out.println(obj4.getInstance_count());	// τυπώνει 5
		
		// Γιατί τυπώνει 5 και όχι 4 (αφού έχουμε obj1, obj2, obj3, obj4);
		
		// Αν πάω σε οποιδήποτε από τα παραπάνω objects και τρέξω την .getInstance_cout() 
		// παίρνω την ίδια τιμή γιατί η μεταβλή instance_count είναι static (δηλαδή κοινή για όλα).
		
		System.out.println("Obj1.getInstance_cout():");
		System.out.println(obj1.getInstance_count()); 	// τυπώνει 5.
		
		// Αν θέλω να δω τις τιμές a, b σε obj1 και obj4 τρέχω.
		System.out.println("Obj1 a, b:");
		System.out.println(obj1.get_a());
		System.out.println(obj1.get_b());
		System.out.println("Obj4 a, b:");
		System.out.println(obj4.get_a());
		System.out.println(obj4.get_b());
	}

}

class ObjectCount {
	
	// Στατική ιδιωτική (μόνο η κλάση ObjectCount το βλέπει).
	// Είναι δηλωμένη ως στατική μεταβλητή, άρα είναι κοινή σε όλα
	// τα instances της κλάσης ObjectCount
	private static int instance_count=0;
	
	private int a;
	private int b;
	
	// default constructor
	public ObjectCount() { instance_count++; a=0; b=0; }
	// constructor με παραμέτρους αρχικοποίησης των a, b
	public ObjectCount(int x, int y) { 
		this(); 	// καλείται ο default constructor όπου καλεί πάνω την instance_count++;
					// όπως με το super() καλούμε τον default constructor της κλάσης
					// που κάνουμε extend, έτσι και εδώ το this() καλεί τον default constructor 
					// της κλάσης εδώ.
		
		this.a=x;	// εδώ είναι το ίδιο να γράψουμε a=x; 
		b=y; 		// είναι το ίδιο να γράψουμε this.b=y;
	}

	// επιστροφή της μεταβλητής instance_count
	public static int getInstance_count() {
		return instance_count;
	}
	
	// επιστροφή της μεταβλητής a 
	// δοκίμασε εδώ να βάλεις public static int get_a(). Γιατί χτυπάει λάθος η java;
	public int get_a() { return a; }
	
	// επιστροφή της μεταβλητής b
	public int get_b() { return b;	}
		

	public static void setInstance_count(int instance_count) {
		ObjectCount.instance_count = instance_count;
	}
	
	// κάνω overload την συνάρτηση toString από ObjectCount την "θεϊκή" κλάση object
	// όπου όλες οι κλάσεις κληρονομούν λειτουργικότητα. Δοκίμασε να αφαιρέσεις
	// τον παρακάτω κώδικα να δεις τι βγαίνει.
	public String toString() {
		return "(instance_cout="+instance_count+", a="+a+", b="+b+")";
	}

	// είναι ο destructor της κλάσης, εδώ καλούμε τον destructor της
	// πατρικής κλάσης, εδώ η πατρική κλάση είναι η "θεϊκή" κλάση Object 
	// όπου καλούμε τον destructor. Γενικά εδώ κλείνουμε εξωτερικά αρχεία 
	// ή resources που έχουμε χρησιμοποιήσει.
	// "The finalize method will be called after the GC detects that the 
	// object is no longer reachable, and before it actually reclaims the 
	// memory used by the object." 
	// http://stackoverflow.com/questions/2506488/java-finalize-method-call
	protected void finalize() throws Throwable {
		super.finalize();
	}
}

