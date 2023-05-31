package Sorting.Cyclesort;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static void main(String[] args) {
       int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(setmismatch(nums)));
    }

    private static int[] setmismatch(int[] nums) {
        int[] ans=new int[2];
        int i=0;
        while(i<nums.length){
            if( nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }}

        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
               ans[0]=nums[j];//return new int[]{num[j],j+1}
               ans[1]=j+1;
            }
        }
        return ans;//return new int[]{-1,-1}
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
