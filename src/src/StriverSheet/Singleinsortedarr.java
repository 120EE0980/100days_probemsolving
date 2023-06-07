package StriverSheet;

import java.util.ArrayList;
import java.util.Arrays;
//time complex : O(n)
public class Singleinsortedarr {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,3,3,5,5));
        System.out.println(findsingle(arr));
    }

    static int findsingle(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans ^= arr.get(i);
        }

        return ans;
    }
}
