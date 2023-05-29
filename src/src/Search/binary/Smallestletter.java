package Search.binary;

public class Smallestletter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char  target= 'j';
        System.out.println(Searchchar(letters,target));
    }

    static char Searchchar(char[] letters, char target) {
       int start=0;
       int end=letters.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(letters[mid]>target){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
       }
        return letters[start % letters.length];//nice logic
    }
}
