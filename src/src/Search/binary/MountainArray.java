package Search.binary;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={0,5,3,1};
        int target=1;
        System.out.println(findminindex(arr,target));
    }

     static int findminindex(int[] arr, int target) {
        int peakindex=findpeakindex(arr);
        if(arr[peakindex]==target){
            return peakindex;
        }
        int index1=  orderagnosticBS(arr,target,0,peakindex-1);
        if(index1!=-1){
          return index1;
        }
        return  orderagnosticBS(arr, target, peakindex + 1, arr.length - 1);
    }
    static int findpeakindex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int orderagnosticBS(int[] arr,int target,int start,int end) {

        boolean isasc;
        if(arr[start]>arr[end]){
            isasc=false;
        }
        else{
            isasc=true;
        }

            while( start<=end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (isasc) {
                    if (arr[mid] > target) {
                        end = mid-1;
                    } else {
                        start = mid +1 ;
                    }

                } else {
                    if (arr[mid] < target) {
                        end = mid-1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        return -1;
    }
}
