package dsa1.anybasetodecimal;

public class Solution {
    public int anybaseToDecimal(int num ,int base){
        int res=0;
        int i=0;
        while(num >0){
            //d:find last digit
            int digit = num % 10;
            //d*baseValue
            res+=digit * Math.pow(base,i) ;
            i++;
            //update the number
            num /= 10;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().anybaseToDecimal(1172,8));
    }
}
