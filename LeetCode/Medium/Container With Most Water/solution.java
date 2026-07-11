class Solution {
    public int maxArea(int[] height) {
        
        int n=height.length;

        int l=0;
        int r=n-1;
        int maximum=0;

        while(l<r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
            maximum=Math.max(maximum,width*h);

            if(height[l]<height[r]){
                l++;
            }

            else{
                r--;
            }
        }

        



        return maximum;
    }
}