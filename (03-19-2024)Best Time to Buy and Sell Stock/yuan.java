class Solution {
    //two pointers O(n)
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, max = 0;
        while (r < prices.length){
            if (prices[l] > prices[r]){
                l = r;
            }else if (prices[l] < prices[r]){
                max = Math.max(max, (prices[r] - prices[l]));
            }
            r++;
        }
        return max;
    }
}