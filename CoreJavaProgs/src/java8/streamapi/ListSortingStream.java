package java8.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = new ArrayList<String>();

		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");

		// ascending order
		List<String> listFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(listFruits);

		List<String> listFruits1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(listFruits1);

		List<String> listFruits2 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(listFruits2);

		// Descending order
		List<String> listFruits3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(listFruits3);

		List<String> listFruits4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(listFruits4);

		System.out.println("----------Sorting Employee by salary---------------");
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "Tapan", 50, 1000));
		empList.add(new Employee(2, "Kumar", 20, 9000));
		empList.add(new Employee(3, "Parida", 5, 1500));
		empList.add(new Employee(4, "Ram", 30, 6000));
		empList.add(new Employee(5, "Gopal", 11, 500));

		// Ascending order
		//Case-1
		List<Employee> empSortedList = empList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		}).collect(Collectors.toList());
		System.out.println(empSortedList);
		
		//Case-2
		List<Employee> empSortedList1 = empList.stream().sorted((o1, o2) -> o1.getSalary() - o2.getSalary())
				.collect(Collectors.toList());
		System.out.println(empSortedList1);
		
		//Case-3
		List<Employee> empSortedList3 = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(empSortedList3);
		
		
		//Descending Order	
		//Case-1
		List<Employee> empSortedList4 = empList.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
				.collect(Collectors.toList());
		System.out.println(empSortedList4);
		
		//Case-2
		List<Employee> empSortedList5 = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(empSortedList5);

		System.out.println("----------Sorting Employee by Name---------------");
		
		//Ascending order		
		List<Employee> empSortedList6 = empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(empSortedList6);
		
		//Descending order	
		List<Employee> empSortedList7 = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		System.out.println(empSortedList7);
		
	}

}
