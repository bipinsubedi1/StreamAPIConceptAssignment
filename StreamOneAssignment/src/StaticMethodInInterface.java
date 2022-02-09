interface NewInterface {

	// static method
	static void hello() {
		System.out.println("Implementation of static method.");
	}

	// Public and abstract method of Interface
	void overrideMethod(String str);
}

public class StaticMethodInInterface implements NewInterface {
	public static void main(String[] args) {
		StaticMethodInInterface interfaceDemo = new StaticMethodInInterface();

		// Calling the static method of interface
		NewInterface.hello();

		// Calling the abstract method of interface
		interfaceDemo.overrideMethod("This is override method.");
	}

	// Implementing interface method

	@Override
	public void overrideMethod(String str) {
		System.out.println(str);
	}
}
