package random;

import java.util.Random;

public class RandomNumGenerate {

	public static void main(String[] args) {

		Random r=new Random();
	
		for(int i=0;i<3;i++) {
			System.out.println(r.nextInt(10));
		}
		
	}

}
