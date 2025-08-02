class minMax{
    public static int[] findMinMax(int[] arr, int n){
        int min= arr[0];
        int max = arr[0];
        for(int i = 0 ; i<n ; i++){
            if(arr[i]<min){
                min= arr[i];
            }
            else if(arr[i]>max){
                max= arr[i];
            }
        }
        int[] ans = new int[2];
        ans[0]= min;
        ans[1]= max;
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int N = arr.length;
        int[] ans = findMinMax(arr , N);
        System.out.println("max " +ans[1]);
        System.out.println("min " +ans[0]);
    }

}