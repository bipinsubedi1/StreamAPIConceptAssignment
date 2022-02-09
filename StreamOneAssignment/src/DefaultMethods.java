interface TestInterface {
	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Implementation of default methods.");
	}
}

public class DefaultMethods implements TestInterface {
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		DefaultMethods d = new DefaultMethods();
		d.square(6);

		// default method executed
		d.show();
	}

}
