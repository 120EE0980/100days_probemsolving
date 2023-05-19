public class Findnosevendig {
    public static void main(String[] args) {
        int[] nums = {6, 56, 7689, 1000};
        System.out.println(findno(nums));
    }

    static int findno(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int noofdigit = 0;
            int b = nums[i];
            while (b > 0) {
                b /= 10;
                noofdigit++;
            }
            if (noofdigit % 2 == 0) {
                count++;
            }

        }
        return count;
    }
}