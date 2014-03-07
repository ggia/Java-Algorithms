package ggia.threads;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello! this is a thread!");
	}

	public static void main(String[] args) {
		(new Thread(new HelloRunnable())).start();

	}

}
