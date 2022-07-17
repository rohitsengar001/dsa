# Maximum sell and buy Problem
>Input: prices = [7,1,5,3,6,4]
Output: 5   
> 
>>Explanation:  Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

## Code
```java
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
```