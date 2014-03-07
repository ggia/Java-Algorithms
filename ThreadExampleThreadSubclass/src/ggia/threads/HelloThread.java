package ggia.threads;

public class HelloThread extends Thread {

	public void run() {
		System.out.println("Hello! This is a thread!");
	}
	public static void main(String[] args) {
		(new HelloThread()).start();

	}

}
