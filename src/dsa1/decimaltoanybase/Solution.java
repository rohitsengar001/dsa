package dsa1.decimaltoanybase;

public class Solution {
    public String decimaltoAnyBaseConv(int n, int base) {
        String res = "";
        while (n > 0) {
            int rem = n % base;
            res = rem + res;
            n = n / base;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(
                new Solution().decimaltoAnyBaseConv(12, 8));
    }
}
