package Recursion;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        int r=arr.length-1;
        int c=0;
        recursionbubble(arr,r,c);
        System.out.println(Arrays.toString(arr));
    }
    static void recursionbubble(int[] arr,int r,int c) {
        boolean swapped=false;
        if(r==0){
            return;
        }
       while(c<r) { //replace while by if to write recursionbubble(arr,r,c+1)
           if (arr[c] > arr[c + 1]) {
               swap(arr, c, c + 1);
               swapped = true;
           }
           c++;//   recursionbubble(arr,r,c+1) but this is causing too many recursion calls;debug and check
       }
        if(!swapped){
            return;
        }
        recursionbubble(arr,r-1,0);
    }
    private static void swap(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
