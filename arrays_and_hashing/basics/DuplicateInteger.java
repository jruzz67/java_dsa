import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        return containsDuplicate(nums);
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}

/*
 * Testcase:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Testcase:
 * Input: nums = [1,2,3,4]
 * Output: false
 */
