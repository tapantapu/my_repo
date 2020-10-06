package arraytest;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] mainArr = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Main Array : " + Arrays.toString(mainArr));

		// Process 1
		int[] reverseArr = new int[mainArr.length];
		int n = mainArr.length;

		for (int i = 0; i < mainArr.length; i++) {
			reverseArr[n - i - 1] = mainArr[i];
		}
		System.out.println("Process 1 Reverse Array : " + Arrays.toString(reverseArr));

		// Process 2
		int[] mainArr1 = { 10, 20, 30, 40, 50, 60, 70 };
		int temp;
		int n1 = mainArr1.length;
		for (int i = 0; i < n1 / 2; i++) {

			temp = mainArr1[i];
			mainArr1[i] = mainArr1[n1 - i - 1];
			mainArr1[n1 - i - 1] = temp;
		}

		System.out.println("process 2 Reverese Array" + Arrays.toString(mainArr1));

	}

}
