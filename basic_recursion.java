import java.util.*;
class demo{
    public static void dis(int count){
        if(count==3)
        return;
        System.out.println("Jairus");
        count++;
        dis(count);
        
    }
    public static void main(String args[]){
        dis(0);
    }
}