class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int l=0;
        int r=n-1;
        int maxi=0;

        while(l<r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
            int area=width*h;
            maxi=Math.max(area,maxi);


            if(height[l]<height[r]){
                l++;
            }

            else{
                r--;
            }

        }

        return maxi;
    }
}