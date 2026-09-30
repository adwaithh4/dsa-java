package array;

public class BruteSubArraySum {

    
    static void maxSubarraySum(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

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