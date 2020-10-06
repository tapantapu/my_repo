package pyramidProg;

public class PyramidTest1 {

	public static void main(String[] args) {

		// Type-1 -->1,2,3,4,5
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		//type-1
		int line_no=1;
		int curr_start = 0;
		
		for(line_no=1;line_no<=5; ) {
			
			if(curr_start<line_no) {
				System.out.print("* ");
				curr_start++;
				continue;
			}
			if(curr_start==line_no) {
				System.out.println("");
				line_no++;
				curr_start=0;
				
			}
		}
		
		System.out.println("-----------------");

		// Type-2 -->5,4,3,2,1
		for (int k = 5; k >= 0; k--) {
			for (int l = 0; l < k; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
