import java.util.*;
public class BasicRecursion{
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

/*
 * Testcase:
 * Input: None (hardcoded call `dis(0)`)
 * Output: 
 * Jairus
 * Jairus
 * Jairus
 */
