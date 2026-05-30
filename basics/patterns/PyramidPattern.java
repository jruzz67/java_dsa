import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            // Nested rows space differentiation for alignment
            for (int ni = 0; ni < n - i - 1; ni++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * Visual representation for n = 8:
 * 
 *        * 
 *       * * 
 *      * * * 
 *     * * * * 
 *    * * * * * 
 *   * * * * * * 
 *  * * * * * * * 
 * * * * * * * * * 
 *
 * Testcase:
 * Input: n = 8
 * Output: (Displays the centered pyramid pattern shown above)
 */
