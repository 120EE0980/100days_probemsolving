package Search.binary;

public class Infinitesortedarray {
    public static void main(String[] args) {
        int[] arr={3,4,7,9,12,16,18};
        int target=18;
        System.out.println(newstartend(arr,target));
    }

  static int newstartend(int[] arr, int target) {
        int start=0;
        int end=1;
if(end>arr.length-1){
    end=arr.length-1;
}
            while(arr[end]<target){
                int temp=start;
                start=end+1;
                end=end+(end-temp+1)*2;
                if(end>arr.length-1){
                    end=arr.length-1;
                }
        }
     return Bsearch(arr,target,start,end);
    }

    static int Bsearch(int[] arr, int target,int start,int end) {
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
}

