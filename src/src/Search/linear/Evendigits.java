package Search.linear;

public class Evendigits {
    public static void main(String[] args) {
                int[] nums = {6, 56, 7689, 1000};
                System.out.println(findno1(nums));
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
    static int findno1(int[] nums) {
        int count1 = 0;
        for (int num : nums) {
            if (even(num)) {
                count1++;
            }

        }
        return count1;
    }

    private static boolean even(int num) {
        int noofdigits= noofdig(num);
        return noofdigits%2==0;

    }
    private static int noofdig(int num) {
        return (int)(Math.log10(num))+1;

    }

        }

