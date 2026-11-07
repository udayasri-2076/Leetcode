class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;

        if(k<=1) return 0;

        int l=0;        
        int count=0;

        int prod=1;
        for(int r=0;r<n;r++){ //0<4t        1<4t     2<4t
            prod=prod*nums[r]; //1*10=10   10*5=50   50*2=100

            while(prod>=k){         //10>100f 50>100f  100>=100t
                prod=prod/nums[l];  //100/10=10
                l++;                //l=0+1=1
            }
            count+=r-l+1;          //0+0-0+1=1  1+1-0+1=3   3+2-1+1=5  5+4-2+1=8
        }

        return count;       //8    
    } 
}