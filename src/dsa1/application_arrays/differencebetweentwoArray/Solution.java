package dsa1.application_arrays.differencebetweentwoArray;

public class Solution {
    //d2 always greater than d1 : assumption
    public int[] findDifference(int[] d1, int[] d2) {
        int ld2 = d2.length - 1; //last index
        int ld1 = d1.length - 1; //last index
        int cb = 0; //carry borrow
        int co = 0; //carry over
        int[] ans = new int[d2.length];
        while (ld2 >= 0) {
            int vald1 = ld1>=0 ? d1[ld1]  : 0;
            int vald2 = d2[ld2];
            int d; //digit : store difference of digit value

            //negative difference means that d1 is greater than d2
            if ((vald2 + co )- vald1 < 0) {
                cb=10;
                d = (vald2+co+cb)-vald1;
                co=-1;
            }else{
                d =(vald2+co)-vald1;
            }
            //store the digit value from right to left
            ans[ld2] =d;

            //decrease the index value and update
            ld2--;
            ld1--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] d1 ={3,3,3};
        int[] d2 ={1,0,0,0};
        for (int element:new Solution().findDifference(d1 , d2)
             ) {
            System.out.print(element);
        }
    }
}
