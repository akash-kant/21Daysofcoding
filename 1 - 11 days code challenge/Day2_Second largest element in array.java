import java.util.* ;
import java.io.*; 
public class Solution {

    public static int findSecondLargest(int n, int[] arr) {

        int largest = Integer.MIN_VALUE;

        int secLargest = Integer.MIN_VALUE;

 

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {

                secLargest = largest;

                largest = arr[i];

            } else if (arr[i] > secLargest && arr[i] < largest) {

                secLargest = arr[i];

            }

        }

 

        if (secLargest != Integer.MIN_VALUE) {

            return secLargest;

        } else {

            return -1;

        }

    }

}
