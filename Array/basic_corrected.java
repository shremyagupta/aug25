import java.util.Scanner;
import java.util.*;

public class basic_corrected {
    public static void main(String[] args) {
        //check if the array is sorted or not
        int[] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("sorted array: " + isSorted);
    }
}
