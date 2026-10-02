package sorting;
import java.util.*;

public class CountingSort {

    public static void countingSort(int[] arr) {

        // Find maximum element
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create count array
        int[] count = new int[max + 1];

        // Count each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Put elements back into original array
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];

        System.out.println("Enter 10 array elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        countingSort(nums);

        System.out.println("Sorted array:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}

