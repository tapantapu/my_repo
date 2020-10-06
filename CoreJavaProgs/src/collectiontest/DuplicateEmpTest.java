package collectiontest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import studentclass.Student;

public class DuplicateEmpTest {

	public static void main(String[] args) {

		List l=new ArrayList();
		
		l.add(new Student(100,"Tapan",100));
		l.add(new Student(100,"Tapan",100));
		l.add(new Student(101,"Parida",101));
		l.add(new Student(101,"Parida",101));
		
		Set<Student> s=new HashSet(l);
		
		for(Student s1: s) {
		System.out.println(s1.getName() +" "+ s1.getRollno());
		
		}
		
		
	
		
		
	}

}
