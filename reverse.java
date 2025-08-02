/*
import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println("" +Arrays.toString(arr));
    }
    
}


//collection.reverse() method uses 
/* 
import java.util.*;
public class reverse{
    static void reverseNum(Integer a[]){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
        
    }
    public static void main(String[] args){
        Integer a[] = {1,2,3,4,5};
        reverseNum(a);
    }
}
*/

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        for(int i = 0 ; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length -1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}     