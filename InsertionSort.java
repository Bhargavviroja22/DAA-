
	public class InsertionSort {
		void sort(int arr[])
		{
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				int key = arr[i];
				int j = i - 1;

				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		}
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		public static void main(String args[])
		{

			long start = System.currentTimeMillis();

			int arr[] = new int[10000];
			int n =arr.length;
			for(int i=arr.length-1;i>0;i--){
				arr[i]= i;
			}

			InsertionSort ob = new InsertionSort();
			ob.sort(arr);

			printArray(arr);

			long end = System.currentTimeMillis();
			long total = end - start;
			System.out.println("Execution Time: "+total+"ms");
		}
	}
	// Time complexity: O(n^2)