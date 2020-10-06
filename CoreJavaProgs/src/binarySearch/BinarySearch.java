package binarySearch;

class BinarySearch {
	// Returns index of key if it is present in arr[l..r], else return -1
	int binarySearch(int arr[], int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;

			// If the element is present at the middle itself
			if (arr[mid] == key)
				return mid;

			// If element is smaller than mid, then it can only be present in left subarray
			if (arr[mid] > key)
				return binarySearch(arr, first, mid - 1, key);

			// Else the element can only be present in right subarray
			return binarySearch(arr, mid + 1, last, key);
		}
		// We reach here when element is not present in array
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
