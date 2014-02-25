package object.fun;

import object.fun.ObjectCount;

public class object_count_driver {

	/** 
	 * Η ιδέα είναι να φτιάξουμε ένα αντικείμενο με static και μην static
	 * μεταβλητές και να δούμε την διαφορά μεταξύ τους
	 * @param args
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
