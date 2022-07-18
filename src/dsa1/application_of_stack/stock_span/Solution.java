package dsa1.application_of_stack.stock_span;

import java.util.Stack;

public class Solution {
    public int[] findSpan(int[] price){
        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<>();
        //iteration price list elements
        for (int i = 0; i < price.length; i++) {
            //pop element if stack is not empty and current price is greater and equal to previous price which is on top of stack
            while(!stack.empty() && price[i]>=price[stack.peek()]){
                stack.pop();
            }
            //update span value : while current price is not greater and equal to previous price
            span[i] = stack.empty() ? i+1 : i- stack.peek();

            //otherwise push indexes into the stack
            stack.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int[] price = { 10, 4, 5, 90, 120, 80 };
        for (int element : new Solution().findSpan(price)
             ) {
            System.out.print(element+" ");
        }
    }
}
