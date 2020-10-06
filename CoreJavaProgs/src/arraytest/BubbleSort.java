package arraytest;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 1, 10, 67, 43 };
		System.out.println("Before Shorting" + Arrays.toString(arr));

		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {//Ascending order //for descending need to use <
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					flag = 1; 
				}
			}
			if (flag == 0)
				break;
		}

		System.out.println("After BubbleShort" + Arrays.toString(arr));

	}

}
