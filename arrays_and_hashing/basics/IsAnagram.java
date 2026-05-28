public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(n!=t.length()){
            return false;
        }
        int freq[]=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
            return false;
        }
        return true;
    }
}


/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
