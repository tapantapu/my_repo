package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionTest {

	public static void main(String[] args) {
		int i = 10;
		NoWrittenFuncIntf d = () -> {System.out.println("Drawing : " + i);	};
		d.draw();
		
		System.out.println("-----------------");
		
		StringWrittenFuncIntf s=()->{return "Tapan";};		
		System.out.println(s.draw());
		
		System.out.println("------------------------");
				
		StringArgFuncIntf argFuncIntf=(name)->{return name;};
		System.out.println(argFuncIntf.namePrint("Tapan Argument"));
	
		System.out.println("-------------------");
	
		IntFuncIntf funcIntf=(a,b)->{return a+b;};
		System.out.println(funcIntf.add(10, 30));
	
		System.out.println("-------------------");
	
		IntFuncIntf funcIntf1=(a,b)->(a+b);
		System.out.println(funcIntf1.add(10, 30));	
		
		System.out.println("-----------------List------------");
		
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

		l.forEach(n->System.out.println(n));
	
	}

}
