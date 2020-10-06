package classnotfound;

public class ClassNotFoundExceptionTest {
public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.drive.OracleDriver");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
