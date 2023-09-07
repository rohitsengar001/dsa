package matrix_path;

public class Solution {
    public static int countPath(int m, int n) {
        if (n == 1 || m == 1)
            return 1;
        return countPath(m - 1, n) + countPath(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(countPath(5,5));
    }
}
