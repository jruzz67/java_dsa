// You are using Java
import java.util.*;
class demo{
    public static void main(String args[]){
        int n=67;
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
            count++;
                if(n/i!=i)
                count++;
            }
        }
        if(count==2)
        System.out.print("prime");
        else
        System.out.print("not prime");
    }
}
