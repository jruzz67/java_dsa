public class LongestSubstringWithoutDuplicates {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int res=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            while(!set.add(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}


/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
