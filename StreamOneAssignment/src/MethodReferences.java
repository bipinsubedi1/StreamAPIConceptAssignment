interface Greetings {
	void greetings ();
}
public class MethodReferences {
public static void greetingsExample () {
	System.out.println ("Hello, Wolrd!");
}
public static void main (String[] args) {
	Greetings someGreetings = MethodReferences :: greetingsExample;
	someGreetings.greetings();
}
}
