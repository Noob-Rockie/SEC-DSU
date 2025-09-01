public class FindMax {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1, 2, 0, 3, 2, 2, 3, 0, 1, 1, 2, 1, 0};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Max: " + max);
    }
}