package Arrays;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(maxrange(arr,1,4));
    }

     static int maxrange(int[] arr,int start,int end) {
    if(arr==null){
        return -1;
    }
    if(start>end){
        return -1;
    }
    int maxVal =arr[start];
         for (int i = start; i < end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
         }
         return maxVal;
    }
}
