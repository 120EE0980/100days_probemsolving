package Search.binary;

public class Floor {
    public static void main(String[] args) {
        int[] nums={2,5,9,24,67,89};
        int target=15;
        System.out.println(floor(nums,target));
    }

     static int floor(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
               start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
