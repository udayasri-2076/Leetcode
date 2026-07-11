class Solution {
    public void sortColors(int[] nums) {
        
        int n=nums.length;          //[2,0,2,1,1,0]

        int low=0;   
        int mid=0;  
        int high=n-1; 

        while(mid<=high){       
            if(nums[mid]==0){    
                nums[mid]=nums[low];
                nums[low]=0;
                mid++;
                low++;

            }

            else if(nums[mid]==1){   
                mid++;
            }

            else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;

            }
        }
    }
}