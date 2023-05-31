package Sorting.Cyclesort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(findalldulicate(nums));
    }

    private static List<Integer> findalldulicate(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }}

        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
              list.add(nums[j]);
            }
        }
        return list;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
