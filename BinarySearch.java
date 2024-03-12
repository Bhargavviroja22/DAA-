class BinarySearch {
	int binarySearch(int arr[], int l, int r, int x)
	{
		while (l <= r) {
			int mid = (l + r) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x) {
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			// so we decrease our r pointer to mid - 1 
			} else if (arr[mid] > x) {
				r = mid - 1;

			// Else the element can only be present
			// in right subarray
			// so we increase our l pointer to mid + 1
			} else {
			l = mid + 1;
			} 
		}
		return -1;
	}

	public static void main(String args[])
	{
        double start = System.currentTimeMillis();
		BinarySearch ob = new BinarySearch();
        int arr[] = new int[10000];
		for(int i=0;i<10000;i++){
			arr[i]=i;
		}
		int n = arr.length;
		int x = 9999;
		int result = ob.binarySearch(arr, 0, n - 1, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+ result);

        double end = System.currentTimeMillis();
        double total =end - start;
        System.out.println(total);
	}
}
