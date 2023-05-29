package Search.binary;
//here it is not a sorted array,still we figure out we can use binary search as it is in a range of nos
public class SplitArraylargestsum {
    public static void main(String[] args) {
        int[] nums={7,2,5,10,8};
        int noofpieces=2;
        System.out.println(split(nums,noofpieces));
    }

     static int split(int[] nums, int noofpieces) {
        int start=0;
         int end= 0;
         for (int i = 0; i <= nums.length-1; i++) {
           end+=nums[i];
           start=Math.max(start,nums[i]);
         }
//range has {10,32}
         while (start<end){
             int mid=start+(end-start)/2;
             int sum=0;
             // calculate how many pieces you can divide this in with this max sum(mid)
             int pieces=1;
             for (int num:nums) {
if(sum+num>mid){
    sum=num;//add this to new subarray
    pieces++;
}else{
    sum+=num;
}
             }
             if(pieces<=noofpieces){
                 end=mid;
             }
             else{
                 start=mid+1;
             }
         }
return end;//here start==end therefore equal to mid
    }
}
