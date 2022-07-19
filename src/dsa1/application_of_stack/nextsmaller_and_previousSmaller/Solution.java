package dsa1.application_of_stack.nextsmaller_and_previousSmaller;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public int[] prevSmaller(int[] array) {
        int[] res = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<array.length; i++){
            while(!stack.empty() && array[stack.peek()] >= array[i]){
                stack.pop();
            }
            res[i] = stack.empty() ? -1 : array[stack.peek()];
            stack.push(i);
        }
        return res;
    }
    public int[] nextSmaller(int[] a, String predicateValue) {
        int[] res = new int[a.length];
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> nextSmaller = new HashMap<Integer, Integer>();
        int currentIndex = 0;
        for (int currentElement : a) {
            while (!stack.empty() && currentElement < a[stack.peek()]) {
                //pushing elements into HashMap (element => nextGreatest/smallest)
                nextSmaller.put(a[stack.pop()], currentElement);
            }
            stack.push(currentIndex++);
        }

        //get element from HashMap
        for (int i = 0; i < a.length; i++) {
            res[i] = nextSmaller.getOrDefault(a[i], -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums2 = {1, 3, 4, 2};
        System.out.print("\nnext Smallest value     : ");
        for (int element : new dsa1.application_of_stack.largestAreainHistogram.Solution().nextSmaller(nums2)) {
            System.out.print(element + ",");
        }
        System.out.print("\nprevious Smallest value : ");
        for (int element : new dsa1.application_of_stack.largestAreainHistogram.Solution().prevSmaller(nums2)) {
            System.out.print(element + ",");
        }
    }
}

