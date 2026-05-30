import java.util.Scanner;

public class RightTrianglePattern {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * Visual representation for n = 8:
 * 
 * * 
 * * * 
 * * * * 
 * * * * * 
 * * * * * * 
 * * * * * * * 
 * * * * * * * * 
 * * * * * * * * * 
 *
 * Testcase:
 * Input: n = 8
 * Output: (Displays the right-angled triangle pattern shown above)
 */
