package array;

import java.util.Scanner;

public class ArrayOperations {

    // 1. Linear Search
    static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    // 2. Binary Search
    // Array must be sorted
    static void binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element not found");
    }

    // 3. Reverse an Array
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 4. Print Pairs in an Array
    static void printPairs(int[] arr) {
        System.out.println("Pairs:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    // 5. Print Subarrays
    static void printSubarrays(int[] arr) {
        System.out.println("Subarrays:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }

    // Main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Linear Search:");
        linearSearch(arr, 3);

        System.out.println("\nBinary Search:");
        binarySearch(arr, 4);

        System.out.println("\nReverse Array:");
        reverseArray(arr);

        // Use original array again
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("\n");
        printPairs(arr2);

        System.out.println();
        printSubarrays(arr2);

        sc.close();
    }
}