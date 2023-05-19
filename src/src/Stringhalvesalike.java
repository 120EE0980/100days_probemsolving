public class Stringhalvesalike {
    public static void main(String[] args) {
        String s="sAnkal";
        System.out.println(findifalike(s));
    }
///we can use substring for string 1 and 2 ,and call countvowels method
     static boolean findifalike(String s) {
         int start=0;
         int end=s.length();
         int mid=start+(end-start)/2;
         int count1=0;
         int count2=0;
         if(s.length()>0){
             for(int i=0;i<mid;i++){
                 if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                     count1++;
                 }
             }
             for(int i=mid;i<s.length();i++){
                 if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                     count2++;
                 }
             }
             return count1==count2;
         }
        return false;
     }
}

