package sorting;
import java.util.*;


public class SelectionSort{
    
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex]= temp;

        }

    }
    public static void main(String[] args){
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array elements \n");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        selectionSort(nums);        

         for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
