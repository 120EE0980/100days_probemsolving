package Search.binary;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,4,8,13,16,19,21};
        int target=14;
        System.out.println(celing(arr,target));
    }

    static int celing(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;//why not return end- violated when  end target start
    }
}
