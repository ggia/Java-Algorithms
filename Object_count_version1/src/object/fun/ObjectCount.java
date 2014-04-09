package object.fun;

public class ObjectCount {
	
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
	public int getInstance_count() {
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
	
	// κάνω overload την συνάρτηση toString από την "θεϊκή" κλάση object
	// όπου όλες οι κλάσεις κληρονομούν λειτουργικότητα. Δοκίμασε να αφαιρέσεις
	// τον παρακάτω κώδικα να δεις τι βγαίνει.
	public String toString() {
		return "(instance_cout="+instance_count+", a="+a+", b="+b+")";
	}

}
