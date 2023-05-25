package Search.binary;

import java.util.Arrays;

public class Firstandlast {
    public static void main(String[] args) {
        int[] nums={5, 7, 7, 8, 8, 10};
        int target=8;
        System.out.println(Arrays.toString(firstandlast(nums,target)));
    }

    private static int[] firstandlast(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=firstlast(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=firstlast(nums,target,false);
        }
        return ans;
    }

    static int firstlast(int[] nums, int target, boolean startIndex) {
        int ans=-1;
        if (nums.length - 1 == 0) {
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while (start <= end) {
            int mid=start+(end-start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (startIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
