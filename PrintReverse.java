public class PrintReverse {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1, 2, 0, 3, 2, 2, 3, 0, 1, 1, 2, 1, 0};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}