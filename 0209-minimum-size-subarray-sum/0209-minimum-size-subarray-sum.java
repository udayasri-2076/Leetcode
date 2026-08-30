class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;

        int l=0;
        int sum=0;
        int minsub=Integer.MAX_VALUE;

        for(int r=0;r<n;r++){
            sum=sum+nums[r];

            while(sum>=target){
                minsub=Math.min(minsub,r-l+1);

                sum=sum-nums[l];
                l++;
                
            }

        }

        return minsub==Integer.MAX_VALUE?0:minsub;
        
    }
}