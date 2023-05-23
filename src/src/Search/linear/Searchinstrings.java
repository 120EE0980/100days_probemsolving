package Search.linear;

import java.util.Arrays;

public class Searchinstrings {
    public static void main(String[] args) {
        String name="nish";
        char target='N';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search2(name,target));
    }

    private static boolean search1(String name,char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
     static boolean search2(String name,char target) {
        if(name.length()==0){
            return false;
        }
         for (int i = 0; i < name.length(); i++) {
            if(target==name.charAt(i)){
                return true;
            }
         }
        return false;
    }
}
