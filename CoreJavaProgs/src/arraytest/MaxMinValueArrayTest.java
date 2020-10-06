package arraytest;

public class MaxMinValueArrayTest {
public static void main(String[] args) {
	
	int[] arr= {10,3,24,56,9,1,23,4,100,-9};
	int max=arr[0];
	int min=arr[0];
	
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
		else if(arr[i]<min)
			min=arr[i];
	}
	
	System.out.println("Max : "+max +" Min : "+min);
	
}
}
