public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        String temp=strs[0];
        for(int i=0;i<temp.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || temp.charAt(i)!=strs[j].charAt(i))
                return str;
                // count++;
            }
            str+=temp.charAt(i);
        }
        return str;
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
