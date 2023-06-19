package StriverSheet.Strings;

public class Rotatedstring {
    public static void main(String[] args) {
        String s= "bbbacddceeb";
        String goal ="ceebbbbacdd";
        System.out.println(rotateString(s,goal));
    }
     static  boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
           return false;
        }

         //this process is wrong we cant compare strings like this as there are duplicates too
//        int shifts=0;
//        for(int i=0;i<s.length();i++){
//
//            if(s.charAt(0)==goal.charAt(i) && s.charAt(0)==s.charAt(goal.length()-1)){
//                shifts=s.length()-i+1;
//            }
//            else if(s.charAt(0)==goal.charAt(i) ){
//                shifts=s.length()-i;
//            }
//        }
//        boolean part1=false;
//        boolean part2=false;
//        if(shifts>0 && shifts<s.length()){
//            String goal1=goal.substring(0,goal.length()-shifts);
//            if (goal1.equals(s.substring(shifts,s.length()))){
//                part1=true;
//            }
//            String goal2=goal.substring(s.length()-shifts,s.length());
//            if (goal2.equals(s.substring(0,shifts))){
//                part2=true;
//            }
//        }
//
//        return part1 & part2;
         return s.length() == goal.length() && (s+s).contains(goal);   //single line answer
    }
}
