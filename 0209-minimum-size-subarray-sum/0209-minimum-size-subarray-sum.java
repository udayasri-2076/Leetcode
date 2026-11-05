class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;

        int ans=Integer.MAX_VALUE;
        int sum=0;

        int l=0;
        for(int r=0;r<n;r++){

            sum=sum+nums[r];

            while(sum>=target){

                ans=Math.min(ans,r-l+1);
                sum=sum-nums[l];
                l++;

            }
        }

        return ans==Integer.MAX_VALUE?0:ans;
    }
}