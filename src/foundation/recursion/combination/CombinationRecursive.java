package foundation.recursion.combination;

public class CombinationRecursive {
    public static int combination(int n, int r){
        //base condition
        if(r == 0 ||n==r){
            return 1;
        }
        return combination(n-1, r-1)+ combination(n-1,r);
    }

    public static void main(String[] args) {
        System.out.println(combination(5,2));
    }
}
