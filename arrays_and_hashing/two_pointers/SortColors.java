public class SortColors {
    public void sortColors(int[] nums) {
        int l = 0, i = 0, r = nums.length - 1;

        while (i <= r) {
            if (nums[i] == 0) {
                int temp = nums[l];
                nums[l] = nums[i];
                nums[i] = temp;
                l++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else { // nums[i] == 2
                int temp = nums[r];
                nums[r] = nums[i];
                nums[i] = temp;
                r--;
            }
        }
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
