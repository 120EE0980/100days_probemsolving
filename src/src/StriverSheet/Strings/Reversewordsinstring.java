package StriverSheet.Strings;
//did not solve
//https://leetcode.com/problems/reverse-words-in-a-string/

public class Reversewordsinstring {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

     static String reverseWords(String s) {
       char[] a= s.toCharArray();
       int n=a.length;
     reverse(a,0,n-1);//reverse string
     //reverse words
         int i=0;int j=0;
        while(i<n){
            while(i>j||a[j]==' ' && j<n){
               j++;
            }
            while(i<j||a[i]!=' ' && i<n){
                i++;
            }
        }
        return " ";
    }

     static void reverse(char[] a, int start, int end) {
         for (int i = 0; i < a.length/2; i++) {
             a[i]=a[a.length-i-1];
         }
    }
}


