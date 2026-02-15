// You are using Java
import java.util.*;
class demo{
    static void recursion(int num,int n){
        if(num==n+1)
        return;
        System.out.print(num);
        num++;
        recursion(num,n);
    }
    static void back_tracking(int num,int n){
        if(num==n+1)
        return;
        back_tracking(num+1,n);
        System.out.print(num);
        // num--;
    }
    public static void main(String args[]){
        int n=8;
        recursion(1,n);
        System.out.println();
        back_tracking(1,n);
    }
}