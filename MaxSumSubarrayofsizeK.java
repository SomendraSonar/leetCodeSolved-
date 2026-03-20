public class MaxSumSubarrayofsizeK {
    public static int solve(int[] arr , int k){
        //Write your code here
        int n= arr.length;

        int windowSum = 0;

        for(int i =0;i<k;i++){
            windowSum +=arr[i];
        }
        int maxSum = windowSum;
        for(int i =k;i<n;i++){
            windowSum+=arr[i];
            windowSum-=arr[i-k];

            maxSum = Math.max(windowSum,maxSum);

        }
        return maxSum;
		
    }
    
}
