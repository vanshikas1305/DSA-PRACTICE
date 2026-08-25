class Solution {
public int maxProfit(int[] arr) {
    int minsofar=arr[0];
    int profit =0;
    for(int i=1; i<arr.length; i++){
        profit = Math.max(profit,arr[i]-minsofar);
        minsofar = Math.min(minsofar,arr[i]);
    }
    
    return profit;
}
    
}