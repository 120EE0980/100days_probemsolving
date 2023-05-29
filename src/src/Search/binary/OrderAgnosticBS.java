package Search.binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={89,70,60,30};
        int target=30;
        System.out.println(orderagnosticBS(arr,target));
    }

   static int orderagnosticBS(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
       boolean isasync;
        if(arr[start]>arr[end]){
             isasync=false;
        }
        else{
            isasync=true;
        }
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (isasync) {
                if (arr[mid] > target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }

            } else {
                if (arr[mid] < target) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
          return -1;
        }
    }

