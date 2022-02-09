import java.util.ArrayList;

public class lambdaExpressions {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(8);
		list.add(4);
		list.add(5);
		list.forEach((n) -> {
			System.out.println(n);
		});
	}
}
