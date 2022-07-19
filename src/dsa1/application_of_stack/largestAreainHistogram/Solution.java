package dsa1.application_of_stack.largestAreainHistogram;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] prevSmaller(int[] array) {
        int[] res = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            while (!stack.empty() && array[stack.peek()] >= array[i]) {
                stack.pop();
            }
            res[i] = stack.empty() ? -1 : stack.peek();
            stack.push(i);
        }
        return res;
    }

    public int[] nextSmaller(int[] a) {
        //store of index
        int[] res = new int[a.length];
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> nextSmaller = new HashMap<Integer, Integer>();
        int currentIndex = 0;
        for (int currentElement : a) {
            while (!stack.empty() && currentElement < a[stack.peek()]) {
                //pushing elements into HashMap (element => nextGreatest/smallest)
                nextSmaller.put(stack.pop(), currentIndex);
            }
            stack.push(currentIndex++);
        }

        //get element from HashMap
        for (int i = 0; i < a.length; i++) {
            //-1 here placed the highest index value for dealing negative number
            res[i] = nextSmaller.getOrDefault(i, a.length);
        }
        return res;
    }

    public int maxAreaOfHistogram(int[] heights) {
        int maxArea = 0;
        int[] ps = prevSmaller(heights);
        int[] ns = nextSmaller(heights);
        for (int prevSmall:ps
             ) {
            System.out.print(prevSmall+",");
        }
        System.out.println();
        for (int nextSmall:ns
        ) {
            System.out.print(nextSmall +",");
        }
        System.out.println();
        for (int i = 0; i < heights.length; i++) {
            int currentArea = (ns[i] - ps[i] -1) * heights[i]; // width* length
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        System.out.println(new Solution().maxAreaOfHistogram(height));
    }
}
