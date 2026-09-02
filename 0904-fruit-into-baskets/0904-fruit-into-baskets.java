class Solution {
    public int totalFruit(int[] fruits) {
        
        
        int n = fruits.length;
        int l = 0;
        int maxlen = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int r = 0; r < n; r++) {

            freq.put(fruits[r], freq.getOrDefault(fruits[r], 0) + 1);

            while(freq.size() > 2) {

                int leftFruit = fruits[l];

                freq.put(leftFruit, freq.get(leftFruit) - 1);

                if(freq.get(leftFruit) == 0) {
                    freq.remove(leftFruit);
                }

                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}