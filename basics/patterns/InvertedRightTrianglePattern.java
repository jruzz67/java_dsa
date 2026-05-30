import java.util.Scanner;

public class InvertedRightTrianglePattern {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            // Alternative: for (int j = 1; j <= n - i; j++)
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * Visual representation for n = 8:
 * 
 * * * * * * * * 
 * * * * * * * 
 * * * * * * 
 * * * * * 
 * * * * 
 * * * 
 * * 
 * * 
 *
 * Testcase:
 * Input: n = 8
 * Output: (Displays the inverted right-angled triangle pattern shown above)
 */
