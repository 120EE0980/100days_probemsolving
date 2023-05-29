package Search.binary;

import java.util.Arrays;
//matrix is sorted in rowwise and columnwise manner
public class Rowcolmatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target=8;
        System.out.println(Arrays.toString(BSSearch2Darray(matrix,target)));
    }

    private static int[] BSSearch2Darray(int[][] matrix, int target) {
        int row =0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
          if(matrix[row][col]==target){
              return new int[]{row,col};
          }
          if(matrix[row][col]>target){
              col=col-1;
          }else{
              row=row+1;
          }
        }
        return new int[]{-1,-1};
    }
}
