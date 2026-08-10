class Solution {
    public int maxProfit(int[] arr) {
       int profit=0;
       int minsofar =arr[0];
     for(int i=1;i<arr.length;i++){
       minsofar=Math.min(minsofar,arr[i]);
       profit = Math.max(profit,arr[i]-minsofar);
     }
    return profit;
    }
}