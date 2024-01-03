import java.util.Arrays;
import java.util.Vector;

public class MinMergeOperations {

	// Function to calculate the minimum number of merge operations
	// to make the array palindrome
	static int minMergeOperations(Vector<Integer> arr) {
		int n = arr.size();
		// Create a 2D array for dynamic programming
		int[][] dp = new int[n][n];

		// Fill the dp table
		for (int gap = 1; gap < n; gap++) {
			for (int i = 0; i < n - gap; i++) {
				int j = i + gap;
				// If the elements at the ends are equal,
				// no additional merge operation is needed
				if (arr.get(i).equals(arr.get(j))) {
					dp[i][j] = dp[i + 1][j - 1];
				}
				// If the elements are different, choose the minimum
				// of the two adjacent elements and add 1 for the merge
				else {
					dp[i][j] = Math.min(dp[i][j - 1], dp[i + 1][j]) + 1;
				}
			}
		}

		// The result is stored at the top-right corner of the dp table
		return dp[0][n - 1];
	}

	public static void main(String[] args) {
		// Example array
		Vector<Integer> arr = new Vector<>(Arrays.asList(11, 14, 15, 99));

		// Print the minimum merge operations needed
		System.out.println(minMergeOperations(arr));
	}
}
