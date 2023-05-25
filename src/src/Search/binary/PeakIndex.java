package Search.binary;

public class PeakIndex {
    public static void main(String[] args) {
       int[] arr={0,2,1,0};
        System.out.println(findpeakindex(arr));
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
}
