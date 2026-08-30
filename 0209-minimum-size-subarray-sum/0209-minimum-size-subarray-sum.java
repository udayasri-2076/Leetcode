class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;

        int l=0;                   //l=0->2
        int sum=0;
        int minsub=Integer.MAX_VALUE;

        for(int r=0;r<n;r++){   //r=0->r[0]=2,r=1->3  r=2->1  r=3->2  r=4->4    r=5 ->3
            sum=sum+nums[r];   //0+2=2     2+3=5     5+1=6    6+2=8   6+4=10    6+3=9

            while(sum>=target){ //2!=7f  5>=7f   6>=7f  8>=7t  6>=7f 10>=7t      7>=7t      6>=7f     9>=7t    7>=7t
                minsub=Math.min(minsub,r-l+1); //(0,3-0+1)=4         (4,4-1+1)=4 (4,4-2+1)=3 (3,5-3+1)=3   (3,5-4+1)=2

                sum=sum-nums[l];  //8-2=6    10-3=7  7-1=6   9-2=7     7-4=3
                l++;              //l=1->3   l=2->1 l=3->2   l=4->4    l=5 ->3
                
            }

        }

        return minsub==Integer.MAX_VALUE?0:minsub;
        
    }
}