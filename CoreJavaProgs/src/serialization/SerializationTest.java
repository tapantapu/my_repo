package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s = new Student(101, "Tapan", 90);

		FileOutputStream fos = new FileOutputStream("C:\\TAPAN\\JAVA\\EclipseWrksSp\\MyTestData\\src\\Serializationtest.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Serailization Completed");

		FileInputStream fis = new FileInputStream("C:\\TAPAN\\JAVA\\EclipseWrksSp\\MyTestData\\src\\Serializationtest.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s1 = (Student) ois.readObject();
		System.out.println("DeSerailization Completed");

		System.out.println("rollno : " + s1.getRollno() + " ,name : " + s1.getName() + " ,mark : " + s1.getMark());

	}

}
