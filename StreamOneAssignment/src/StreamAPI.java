import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("GM");
		stringList.add("Ford");
		stringList.add("Honda");
		stringList.add("Hyundai");

		Stream<String> stream = stringList.stream();

		long count = stream.map((value) -> {
			return value.toLowerCase();
		}).count();

		System.out.println("count = " + count);

	}
}
