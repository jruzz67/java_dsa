public class ValidPalindromeIi {
    public static boolean ispalindrome(int l,int r, String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
            return false;
            r--;
            l++;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                if(ispalindrome(l+1,r,s))
                return true;
                else if(ispalindrome(l,r-1,s))
                return true;
                else
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}

/*
 * Testcase:
 * Input: <example input>
 * Output: <example output>
 */
