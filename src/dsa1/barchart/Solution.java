package dsa1.barchart;

public class Solution {
    public int findMax(int[] a){
        int max =0;
        for (int j : a) {
            if (j > max) max = j;
        }
        return max;
    }
    public void barchart(int[] arr){
        int max= findMax(arr);
        //find maximum floor
        for (int floor = max; floor > 0 ; floor--) {
            for (int i = 0; i < arr.length; i++){
                if (arr[i] >= floor) {
                    System.out.print("\t*");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Solution().barchart(new int[]{3, 5, 6, 0, 1});
    }
}
