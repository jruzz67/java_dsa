import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    // =========================================================================
    // 1. STANDARD MANUAL ITERATIVE APPROACH (Default & Highly Recommended for Space)
    // =========================================================================
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents integer overflow

            if (arr[mid] == target) {
                return mid; // Target found
            }
            if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    // =========================================================================
    // 2. MANUAL RECURSIVE APPROACH (Time: O(log n), Space: O(log n) call stack)
    // =========================================================================
    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; // Base case: Target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, high, target); // Recur right half
        } else {
            return binarySearchRecursive(arr, low, mid - 1, target); // Recur left half
        }
    }

    // =========================================================================
    // 3. BUILT-IN JAVA METHODS (Fastest to Write)
    // =========================================================================
    
    // For Arrays: Use Arrays.binarySearch()
    public static int binarySearchBuiltInArray(int[] arr, int target) {
        Arrays.sort(arr); // Arrays must be sorted first
        return Arrays.binarySearch(arr, target);
    }

    // For Lists/Collections: Use Collections.binarySearch()
    public static int binarySearchBuiltInList(List<Integer> list, int target) {
        Collections.sort(list); // Collection must be sorted first
        return Collections.binarySearch(list, target);
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 11, 20, 35, 48};
        
        System.out.println("Manual Iterative Search (target 20): " + binarySearch(arr, 20));
        System.out.println("Manual Recursive Search (target 48): " + binarySearchRecursive(arr, 0, arr.length - 1, 48));
        System.out.println("Built-In Array Search (target 11): " + binarySearchBuiltInArray(arr, 11));
    }
}

/*
 * Testcase:
 * Input: arr = [3, 9, 11, 20, 35, 48], target = 20
 * Output: 3
 *
 * Testcase:
 * Input: arr = [3, 9, 11, 20, 35, 48], target = 48
 * Output: 5
 */
