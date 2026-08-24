class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;

        int l=0;
        int r=l+1;
        int m=0;

        while(r<n){
            int diff=prices[r]-prices[l];

            if(prices[r]<prices[l]){
                l=r;
            }

            else{
                m=Math.max(diff,m);
            }

            r++;



        }

        return m;
    }
}