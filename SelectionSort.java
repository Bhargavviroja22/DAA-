
import java.io.*;
public class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{ long start = System.currentTimeMillis();
		SelectionSort ob = new SelectionSort();
		int arr[] = new int[10000];
		for(int i=arr.length-1;i>0;i--){
			arr[i]=i;
		}
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
		long end = System.currentTimeMillis();
		long total = end - start;
		System.out.println(total+"ms");
	}
}
//Time complexity:O(n^2)