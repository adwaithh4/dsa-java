package array;

public class Prefixsum {

    // Maximum Subarray Sum using Prefix Sum
    static void maxSubarraySum(int[] arr) {

        int n = arr.length;

        // Create prefix sum array
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int sum;

                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, 4, -1, 2};

        System.out.print("Array: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        maxSubarraySum(arr);
    }
}
