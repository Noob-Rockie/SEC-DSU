public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1, 2, 0, 3, 2, 2, 3, 0, 1, 1, 2, 1, 0};
        for (int num : arr) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println();
    }
} 