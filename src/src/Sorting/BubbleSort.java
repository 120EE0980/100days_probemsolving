package Sorting;
//Bubble,selection,insertion sorts
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void insertion(int[] arr) {
         for (int i = 0; i <= arr.length-2; i++) {
             for (int j = i+1; j >0 ; j--) {
                 if (arr[j] < arr[j - 1]) {
                       swap(arr, j-1, j );
                 }else{
                       break;
                      }
             }
             }
             }


    static  void selection(int[] arr){
     for (int i = 0; i < arr.length; i++) {
        int maxindex=getmaxindex(arr,0,arr.length-i-1);
         //swap
         swap(arr,maxindex,arr.length-i-1);
     }
 }

    private static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    private static int getmaxindex(int[] arr, int start, int end) {
        int maxindex=0;
        for (int j = start; j <= end; j++) {
            if(arr[maxindex]<arr[j]){
                    maxindex=j;
            }
        }
        return maxindex;
    }

    static void bubble(int[] arr) {
        boolean swapped;
      for (int i = 0; i < arr.length; i++) {
          swapped=false;
          for (int j = 1; j < arr.length-i ; j++) {  //for every pass,highest value comes at end
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                swapped=true;
            }
          }
          if (!swapped){   // if swapped remains false then array is already sorted
            break;
          }
      }

    }
}
