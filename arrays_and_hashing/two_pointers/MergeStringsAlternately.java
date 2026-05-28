public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int l=0;
        int n=word1.length();
        int m=word2.length();
        StringBuilder res=new StringBuilder();
        while(l<n && l<m){
            res.append(word1.charAt(l));
            res.append(word2.charAt(l));
            l++;
        }
        while(l<n){
            res.append(word1.charAt(l));
            l++;
        }
        while(l<m){
            res.append(word2.charAt(l));
            l++;
        }
        return res.toString();
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
