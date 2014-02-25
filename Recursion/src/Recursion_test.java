
public class Recursion_test {

	public static void main(String[] args) {
		System.out.println(xyz(6));
	}
	
	public static int xyz(int num) {
		if (num==1) 
			return 1;
		else return (xyz(num-1) + num);
	}

}
