package dsa1.application_arrays.stock_buy_sale_maxprofit;

public class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int maxProfit=0;
        int profit;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            profit=arr[i] - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr= {5,2,6,1,4};
        System.out.println(new Solution().maxProfit(arr));
    }
}
