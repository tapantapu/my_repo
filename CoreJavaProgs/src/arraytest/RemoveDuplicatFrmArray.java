package arraytest;

import java.util.Arrays;

public class RemoveDuplicatFrmArray {

	public static void main(String[] args) {

		int arr[] = { 10, 50, 40, 20, 10, 90, 30, 10, 50, 40 };
		Arrays.sort(arr);// sorting array
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];
		}
		arr[j++] = arr[arr.length - 1];

		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
