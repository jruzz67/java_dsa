public class LinearSearch {
    public static int search(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i; // Element found, return index
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {4, 12, 8, 23, 7, 19, 5};
        int target = 7;
        int index = search(numbers, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

/*
 * Testcase:
 * Input: numbers = [4, 12, 8, 23, 7, 19, 5], target = 7
 * Output: Element found at index: 4
 */
