package java8.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		Stream<String> stream= Stream.of("A","B","C");
		stream.forEach(System.out::println);
		
		System.out.println("--------------");
		Collection<String> collection=Arrays.asList("JAVA","J2EE","Spring","Hibernate");		
		Stream<String> streamC=collection.stream();
		streamC.forEach(System.out::println);
		
		System.out.println("--------------");
		List<String> list=Arrays.asList("JAVA","J2EE","Spring","Hibernate","J2EE");
		Stream<String> streamL=list.stream();
		streamL.forEachOrdered(System.out::println);
		
		System.out.println("----------------------");
		Set<String> set=new HashSet<>(list);
		Stream<String> streamS=set.stream();
		streamS.forEach(System.out::println);
		
		System.out.println("----------------------");
		String[] arr= {"JAVA","J2EE","Spring","Hibernate","J2EE"};
		Stream<String> streamA=Arrays.stream(arr);
		streamA.forEach(System.out::println);
		
		

	}

}
