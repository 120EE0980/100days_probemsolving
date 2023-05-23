package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse1(arr);
       // System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(arr));
    }

   static int[] reverse(int[] arr) {
       for (int i = 0; i < arr.length/2; i++) {
        int temp= arr[i];
          arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
       }
        return arr;
    }
    static void reverse1(int[] arr) {
        int start=0;
        int end= arr.length-1;
        while(start<end){
          swap(arr,start,end);
          start++;
          end--;
    }
    }

    static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
