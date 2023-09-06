package dsa1.seive_eratosthenes;

import java.util.Arrays;

public class Solution {

    public static boolean[] primeNumsList(int n) {
        boolean[] primeNums = new boolean[n + 1];
        //initialized the values of array from true
        Arrays.fill(primeNums, true);
        primeNums[0] = false;
        primeNums[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j < n; j += i) {
                primeNums[j] = false;
            }
        }
        return primeNums;
    }

    public static void main(String[] args) {
        boolean[] isPrime = primeNumsList(20);
        for (int i = 0; i < 20; i++) {
            if (isPrime[i])
                System.out.println(i + ":" + isPrime[i]);
        }
    }
}
