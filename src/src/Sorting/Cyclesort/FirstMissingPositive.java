package Sorting.Cyclesort;
// https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={1000,-1} ;
        System.out.println(firstmissingpositive(nums));
    }

    private static int firstmissingpositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }}
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }  
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
