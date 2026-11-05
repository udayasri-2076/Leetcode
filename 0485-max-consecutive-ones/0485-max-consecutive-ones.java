class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;

        int maxans=Integer.MIN_VALUE;
        int count=0;

        for(int j=0;j<n;j++){
            if(nums[j]==1){
                count++;
            }

            else{
                maxans=Math.max(maxans,count);
                count=0;
            }
        }

        return Math.max(maxans,count);
    }
}