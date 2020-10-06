package constructor.helloWorld;

public class ConstructorHelloWorld {

	public String name;
	
	public ConstructorHelloWorld(String name) {
		this.name=name;
	}
	
	public  void getName() {
		System.out.println("Hello ->"+name);
	}
	
}
