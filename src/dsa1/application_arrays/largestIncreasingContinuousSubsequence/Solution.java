package dsa1.application_arrays.largestIncreasingContinuousSubsequence;

public class Solution {
    public int largestIncreasingContinuousSubsequence(int[] array) {
        int anchor = 0;
        int result = 0;
        //iteration of each element of the array
        for (int i = 0; i < array.length; i++) {
            //check if value is smaller than previous value
            //then update anchor
            if (i > 0 && array[i - 1] >= array[i]) anchor = i;
            //formula for find length of window
            // distance_between_indexes = lastIndex - firstIndex + 1
            result = Math.max(result, i - anchor + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,4,7};
        System.out.println(new Solution().largestIncreasingContinuousSubsequence(array));
    }
}
