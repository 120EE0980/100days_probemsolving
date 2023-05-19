public class Matrixdiagonalsum {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Matrixsum(mat));
    }
    static int Matrixsum(int[][] mat){
        int sum=0;
        int n=mat.length;
        int mid=mat.length/2;
        for (int i = 0; i < n; i++) {
            sum+=mat[i][i];
            sum += mat[n-1-i][i];
        }
        if(n%2==1){
            sum-=mat[mid][mid];
        }
        return sum;
    }
}
