import java.util.Scanner;
import java.util.*;

public class basic_fixed {
    public static void main(String[] args) {
       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements");
        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is:");
        for(int i = 0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();

        */
        //max element
        /* 
        int[] arr = {4,3,6,9,2,1};
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
           
        }
         System.out.println("max elemnt " +max);
         
        //reverse array
        int[] arr ={10,20,30,40,50};
        int start = 0 , end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;

            start++;
            end--;
        }

    System.out.println("reverse an array" +Arrays.toString(arr));
    */

        //check if the array is sorted or not
        int[] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++){  // Fixed: i < arr.length-1 instead of i < arr.length
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("sorted array: " + isSorted);

    }
}
