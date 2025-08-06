import java.util.*;
public class twoSum{
    public static void main(String[] args) {
        int[] arr = { 2,7,11,6};
        int target =9;

        //hash map
        Map<Integer,Integer> map = new HashMap<>();
        for(int i  =0 ; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("Indices" +map.get(complement) + "and" +i);
                return;
            }
            map.put(arr[i],i);
        }
        /* 
        for(int i = 0; i<arr.length ; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("the sum is" + i + "and" + j);
                    return;
                }
            }
    }
                */
        }
    }
