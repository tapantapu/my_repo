package java8.streamapi;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// findFirst() and findAll()
		Optional<Integer> element = list.stream().findFirst();

		if (element.isPresent()) {
			System.out.println(element.get());
		} else {
			System.out.println("stream is empty");
		}

		Optional<Integer> element1 = list.stream().findAny();

		if (element1.isPresent()) {
			System.out.println(element1.get());
		} else {
			System.out.println("stream is empty");
		}

		// count(), min() and max()
		// count()
		Stream<Integer> elements = Stream.of(1, 2, 4, 5, 7, 8);
		System.out.println(elements.count());
		// min()
		Stream<Integer> elements1 = Stream.of(1, 2, 4, 5, 7, 8);
		Integer min = elements1.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		// max()
		Stream<Integer> elements2 = Stream.of(1, 2, 4, 5, 7, 8);
		Integer max = elements2.max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);

	}

}
