public class Ispoweroffour {
    public static void main(String[] args) {
        int n=16;
        System.out.println(poweroffour(n));
    }
//this did not use recursion to solve but want to solve using recursion
     static boolean poweroffour(int n) {
        return (n & n-1)==0 & (n-1)%3 ==0;
    }
}
