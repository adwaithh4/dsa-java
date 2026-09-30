package array;

public class Kadane {

    static void maxSubarraySum(int[] arr) {

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
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