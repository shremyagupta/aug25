public class kadanes {
    public static void main(String[] args) {
        
    int[] arr = { -2,1,3,4,-1,2,1,-5,4};
    int maxSum = Integer.MIN_VALUE;
    for(int start =0 ; start<arr.length; start++){
        int currSum = 0;
        for(int end=start ; end<arr.length; end++){
            currSum = currSum +arr[end];
            maxSum = Math.max(maxSum , currSum);
        }
    }
    System.out.println("max sum of an array " +maxSum);
    /* 
    int maxSum = arr[0];
    int currSum = arr[0];
    for(int i = 0 ; i<arr.length; i++){
        currSum  = Math.max(arr[i],currSum+arr[i]);
        maxSum = Math.max(maxSum, currSum);
    }
    System.out.println("maximum sum   "   + maxSum);
    */

}
}