public class maxSub {
    public static void maxSubArray(int[] arr){
        int maxSum = arr[0];
        int currSum = arr[0];
        int start = 0 ;
        int end = 0; 
        int tempStart =0;
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i]>currSum +arr[i]){
                currSum= arr[i];
                tempStart = i;
            }
            else{
                currSum += arr[i];

            }
            if(currSum>maxSum){
                maxSum= currSum;
                start = tempStart;
                end =i;
            }
        }
        System.out.println("maxsum of the array" +maxSum);
        System.out.println("Subarray");
        for(int i = start; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = { -2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(arr);
    }
    
}
