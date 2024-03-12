
class LinearSearch {
	// This function returns index of element x in arr[]
	static int search(int arr[], int n, int x)
	{
		for (int i = 0; i < n; i++) {
			// Return the index of the element if the element
			// is found
			if (arr[i] == x)
				return i;
		}

		// return -1 if the element is not found
		return -1;
	}

	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		int arr[] = new int[10000];
		for(int i=0;i<arr.length;i++){
			arr[i]=i;
		}
		
		int n = arr.length;
		
		int x = 9999;

		int index = search(arr, n, x);
		if (index == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element found at position " + index);
		long end = System.currentTimeMillis();
		long total = end - start;

		System.out.println(total);
	}
}
