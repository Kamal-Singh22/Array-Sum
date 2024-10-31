public class ArraySum {

    public static int findSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Sum of array1: " + findSum(array1)); // Output: 15

        int[] array2 = {1, 2, 1, 1, 5, 1};
        System.out.println("Sum of array2: " + findSum(array2)); // Output: 11
    }
}
