class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        
        int sum=0;
        
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        
        int maxans=sum;
        
        for(int j=k;j<n;j++){
            sum=sum+arr[j];
            sum=sum-arr[j-k];
            
            maxans=Math.max(maxans,sum);
        }
        
        return maxans;
    }
}