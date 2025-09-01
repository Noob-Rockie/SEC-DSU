public class PrintIndex {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1, 2, 0, 3, 2, 2, 3, 0, 1, 1, 2, 1, 0};
        int z = 3; // change this value to find other numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == z) System.out.println("Index: " + i);
        }
    }
}