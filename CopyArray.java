public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1, 2, 0, 3, 2, 2, 3, 0, 1, 1, 2, 1, 0};
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        // Print copied array
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}