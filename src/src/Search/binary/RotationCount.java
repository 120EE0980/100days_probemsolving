package Search.binary;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr={12,14,1,2,3};
        System.out.println(countrotations(arr));
    }

     static int countrotations(int[] arr) {
        int pivot=findpivotwithoutduplicates(arr);
     return pivot+1;
    } private static int findpivotwithoutduplicates(int[] arr) {
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

