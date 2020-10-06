package interfacetest;

public interface K extends I,J {
	
	
public void sub();

@Override
default void fun1() {
	// TODO Auto-generated method stub
	System.out.println("Overide func1() bcz same defult method availabel in interface i,J");
}



}
