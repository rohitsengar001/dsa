package foundation.recursion.optimization;

import java.util.HashMap;

public class Solution {
    static int count = 0;
    static HashMap<Integer, Integer> ans = new HashMap<>();
    public static int fib(int n) {
        int a, b, c;
        System.out.println("call "+count+":f("+n+")");
        if (n <= 1) return n;
        if (ans.containsKey(n - 2)) {
            a = ans.get(n - 2);
        } else {
            count++;
            a = fib(n - 2);
            ans.put(n - 2, a);
        }
        if (ans.containsKey(n - 1)) {
            b = ans.get(n - 1);
        } else {
            count++;
            b = fib(n - 1);
            ans.put(n - 1, b);
        }
        c = a + b;
        return c;
    }

    public static void main(String[] args) {
        count++;
        int n=6;
        fib(n);
        System.out.println("total calls of f("+n+"):" + count);
    }
}
