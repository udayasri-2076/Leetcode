class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int n=nums.length;
        Arrays.sort(nums); //-4,-1,1,2

        int close=nums[0]+nums[1]+nums[2];
        //close=-4+-1+1=-4

        for(int i=0;i<n-2;i++){  //i=0
            int l=i+1;          //l=1
            int r=n-1;          //3

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];  //-4+-1+2=-3

            if(Math.abs(sum-target)<Math.abs(close-target)){  //-3-1=-4< -4-1=-5f
                close=sum;

                //close=-3
            }

            if(sum==target){
                return sum;
            }

            else if(sum<target){
                l++;
            }

            else{
                r--;
            }
        }
        }

        return close;

    }
}