package Search.binary;
//PIVOT is simply the highest no. in arr
public class RBS {
    public static void main(String[] args) {
        int[] nums={3,3,1,2};
        int target=1;
        System.out.println(rotatedBS(nums,target));
    }

   static int rotatedBS(int[] nums, int target) {
        int pivot=findpivotwithduplicates(nums);
if(pivot==-1){
    return Bsearch(nums,target,0,nums.length-1);
}
if(nums[pivot]==target){
    return pivot;
}
if(target>=nums[0]){
   return Bsearch(nums,target,0,pivot-1);
}
else{
    return Bsearch(nums,target,pivot+1,nums.length-1);
}

    }
    static int Bsearch(int[] nums, int target, int start, int end) {

        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            if(target<nums[mid]){
                end=mid-1;
            }
        }
        return -1;
    }

    private static int findpivotwithoutduplicates(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[start] && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
     return -1;
    }
    static int findpivotwithduplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[start] && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if(arr[start]==arr[mid]&& arr[end]==arr[mid]){
              //ex={2,9,2,2,2}  ignore duplicate values so do
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if (arr[start]>arr[mid]|| arr[mid]==arr[start] && arr[mid]>arr[end]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
//else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
     }


        return -1;
    }
}
