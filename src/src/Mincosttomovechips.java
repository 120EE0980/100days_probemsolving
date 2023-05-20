
//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class Mincosttomovechips {
    public static void main(String[] args) {
       int[] position={2,2,2,3,3};
        System.out.println(mincost(position));
    }

    static int mincost(int[] position) {
        int even=0;
        for(int i : position){
            if(i%2==0){
                even++;
            }
        }
        return Math.min(even,position.length-even);
    }
}
