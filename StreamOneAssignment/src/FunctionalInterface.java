
public class FunctionalInterface {
public static void main (String[] args) {
	new Thread (() -> {
		System.out.println ("Demo of implementation of functional interface using lambda expression.");
	}).start ();
}
}
