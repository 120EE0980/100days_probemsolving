package Recursion;

import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        String str="23";
        System.out.println( phonepad("",str));

    }

     static ArrayList<String> phonepad(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
         ArrayList<String> list=new ArrayList<>();
        int digit = up.charAt(0)-48;//ascii value of '2' is 50
       for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
           char ch=(char)('a'+i);
           list.addAll(phonepad(p+ch,up.substring(1)));
             }
       return list;
    }
}
