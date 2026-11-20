class Solution {
    public int mySqrt(int x) {
        if (x<2) return x;

        int l=0;
        int r=x/2;

        while(l<=r){
            long mid=l+(r-l)/2;
            long sq=mid*mid;

            if(sq==x){
                return (int) mid;
            }

            else if(sq<x){
                l=(int)mid+1;
            }
            else{
                r=(int)mid-1;
            }
        }
        return (int)r;
    }
}