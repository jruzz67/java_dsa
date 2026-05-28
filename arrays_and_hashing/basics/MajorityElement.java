public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count=0;
        int canditate=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0)
            canditate=nums[i];
            if(canditate==nums[i])
            count++;
            else
            count--;
        }
        return canditate;
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
