package arraytest;

public class Array2D {
	/*static int i=10;

	static void fun(int i) {
		//static int i=10; //--->static local variable we can't define inside method.
		System.out.println(i);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{10,20,30},{11,12,13},{22,23,24}};
		
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) 
				System.out.print(arr[i][j]+" ");
				
				
			System.out.println();
		}
		/*fun(10);*/
	}

}
