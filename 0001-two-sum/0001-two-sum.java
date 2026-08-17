class Solution {
    public int[] twoSum(int[] nums, int target) {   //2,7,11,15 target=9
        HashMap<Integer,Integer> map=new HashMap<>();  



        for(int i=0;i<nums.length;i++){  //i=0 i<4t  i=1[7] 1<4t
            int diff=target-nums[i];    //9-2=7      9-7=2

            if(map.containsKey(diff)){     //2:0    2:1 ->map contains value 2
                return new int[]{map.get(diff),i};  //[0,1]
            }

            map.put(nums[i],i); //[2,0]
        }
        return new int[]{-1,-1};
    }
}