package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(67);
        list.add(234);
        System.out.println(list);
        System.out.println(list.contains(2));
        list.set(0,99);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
