public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int res=0;
        for(int num:nums){
            if(num==1)
            res++;
            else{
                res=0;
            }
            max=Math.max(max,res);
        }
        return max;
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
