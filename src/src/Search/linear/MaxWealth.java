package Search.linear;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(max(accounts));
        //System.out.println(Integer.MIN_VALUE);
    }


  static int max(int[][] accounts) {
      int maxWealth=0;//Integer.MIN_VALUE
      for(int[] costumer :accounts){
          int wealth=0;
          for(int i=0;i<costumer.length;i++){
              wealth+=costumer[i];
          }
          if(wealth>maxWealth){   //
              maxWealth=wealth;  //Math.max(wealth,maxWealth)
          }
      }
      return maxWealth;
  }
    }

