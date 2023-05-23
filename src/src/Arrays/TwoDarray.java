package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr=new int[2][2];
//        int[][] arr={{1,2,3},{4,5},{6,7,8,9}};
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
        }
        for(int[] b:arr){
            System.out.println(Arrays.toString(b));
            //even for integers also use Arrays.toString
        }
        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();

        }
        for (String ele:str) {
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));
    }

}
