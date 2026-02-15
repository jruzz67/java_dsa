import java.util.*;
class demo{
    static int recursion(int n){
        if(n==1)
        return 1;
        return n + recursion(n-1);
        
        
    }
    public static void main(String args[]){
        int n=8;
        int res=recursion(n);
        System.out.println(res);
        // back_tracking(n);
    }
}

// output:
// 12345678
// 87654321