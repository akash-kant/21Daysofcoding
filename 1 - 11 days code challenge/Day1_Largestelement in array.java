import java.util.* ;
import java.io.*; 

public class Solution {

    public static int largestElement(int[] arr, int n) {
    int i;

		// Initialize maximum element
		int max =Integer.MIN_VALUE;

		// Traverse array elements from second and
		// compare every element with current max
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max){
                max = arr[i];
            }
		return max;
	}

	// Driver code
	public static void main(String[] args)
	{   int arr[] = {1,2,3,4,5};
        int n= arr.length;
		System.out.println("Largest in given array is "+ largestElement(arr,n));
	}
}
