package Search.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,3,4,7,9};
        int target=9;
        System.out.println(Bsearch(arr,target,0,arr.length-1));
    }

     static int Bsearch(int[] arr, int target, int start, int end) {

        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
}
