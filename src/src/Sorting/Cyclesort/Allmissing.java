package Sorting.Cyclesort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Allmissing {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(allmissing(nums));//no need of Arrays.toString here
    }

    static List<Integer> allmissing(int[] nums) {
       List<Integer> list= new ArrayList<>();   //ArrayList<Integer> can also be used
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){  //here we should not use nums[i]!=i+1
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                list.add(j+1);
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
