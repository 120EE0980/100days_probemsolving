package Sorting.Cyclesort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

 static void cyclesort(int[] arr) {
        int i=0;
     while(i<arr.length){
         if(arr[i]!=arr[arr[i]-1]){//dont use arr[i]!=i,it doesnt work for duplicate values
             swap(arr,i,arr[i]-1);
         }else{
             i++;
         }
     }
    }
 static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
