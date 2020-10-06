package collectiontest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ConcurrentModificationExceptionTest {

	public static void main(String[] args) {

		List<String> l = new ArrayList();
		l.add("Hi");
		l.add("Hello");
		l.add("LOL");

		/*ConcurrentModificationException 
		 * 
		 * for (String s : l) {
			// System.out.println(s);

			if (s.equalsIgnoreCase("Hi"))
				l.remove("Hi");
		}*/
		
		
		ListIterator li=l.listIterator();
		
		while(li.hasNext()) {
			String word=(String)li.next();
			
			if(word.equalsIgnoreCase("Hi")) {
				li.remove();
			}
			
		}
		
		System.out.println(l);

	}

}
