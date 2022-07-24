package dsa1.application_arrays.kadanesAlgo;

public class Solution {
    public int kadanesAlgo(int[] a) {
        int csum = a[0];
        int osum = a[0];
        for (int i = 1; i < a.length; i++) {
            //if current sum is not negative then
            if (csum > 0)
                csum += a[i];
            else 
                csum = a[i];

             //challenge the current sum to overall sum
             if (csum > osum)
                  osum = csum;
        }
        return osum;
    }
    public static void main(String[] args) {
            int[] nums={3,4,6,7,8};
        System.out.println(new Solution().kadanesAlgo(nums));
        }
}
